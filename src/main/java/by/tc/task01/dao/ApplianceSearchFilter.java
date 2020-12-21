package by.tc.task01.dao;

import by.tc.task01.entity.criteria.Criteria;

import java.util.List;

public class ApplianceSearchFilter {
    public boolean matchesFilter(Criteria criteria, List<String> parsedData) {
        if (criteria.getGroupSearchName() != null) {
            if (!criteria.getGroupSearchName().equals(parsedData.get(0))) {
                return false;
            }
        }
        for (int i = 1; i < parsedData.size() - 1; i++) {
            if (i % 2 == 1) {
                if (criteria.getCriteria().get(parsedData.get(i)) != null) {
                    if (criteria.getCriteria().get(parsedData.get(i)) != parsedData.get(i + 1)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}