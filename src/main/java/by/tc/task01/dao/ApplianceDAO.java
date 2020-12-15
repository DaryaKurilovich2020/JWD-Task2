package by.tc.task01.dao;

import by.tc.task01.entity.Appliancable;
import by.tc.task01.entity.criteria.Criteria;

public interface ApplianceDAO {
	Appliancable find(Criteria criteria);
}
