package by.tc.task01.dao.impl;

import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.entity.Appliancable;
import by.tc.task01.entity.criteria.Criteria;

import java.io.InputStream;
import java.util.Scanner;

public class ApplianceDAOImpl implements ApplianceDAO {
    private InputStream inputStream;
    private final Scanner scanner = new Scanner(inputStream);

    @Override
    public Appliancable find(Criteria criteria) {
        // you may add your own code here
        return null;
    }

}


//you may add your own new classes