package by.tc.task01.service;

import by.tc.task01.entity.Appliancable;
import by.tc.task01.entity.criteria.Criteria;

public interface ApplianceService {	
	
	Appliancable find(Criteria criteria);
	
}
