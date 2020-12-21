package by.tc.task01.dao.impl;

import by.tc.task01.dao.*;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.ApplianceFactory;
import by.tc.task01.entity.criteria.Criteria;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ApplianceDAOImpl implements ApplianceDAO {

    @Override
    public List<Appliance> find(Criteria criteria) throws IOException {
        ApplianceReader applianceReader = new ApplianceReader();
        List<String> appliancesData = applianceReader.read();

        Iterator<String> applianceDataIterator = appliancesData.iterator();
        ApplianceDataParser applianceDataParser = new ApplianceDataParser();
        String applianceDataBlock;

        ApplianceSearchFilter applianceSearchFilter = new ApplianceSearchFilter();

        List<String> parsedAndFilteredApplianceData;
        List<String> parsedApplianceData;

        List<Appliance> foundAppliances = new ArrayList<Appliance>();
        ApplianceFactory applianceFactory = new ApplianceFactory();

        while (applianceDataIterator.hasNext()) {
            applianceDataBlock = applianceDataIterator.next();
            parsedApplianceData = applianceDataParser.parse(applianceDataBlock);

            parsedAndFilteredApplianceData = applianceDataParser.parseAndFilter(applianceDataBlock);
            Appliance appliance = applianceFactory.create(parsedAndFilteredApplianceData);

            if (applianceSearchFilter.matchesFilter(criteria,parsedApplianceData)) {
                foundAppliances.add(appliance);
            }
        }
        return foundAppliances;
    }
}


//you may add your own new classes