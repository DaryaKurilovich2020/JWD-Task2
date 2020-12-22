package by.tc.task01.service.validation;

import by.tc.task01.entity.criteria.Criteria;

import java.util.HashMap;
import java.util.Map;

public class Validator {

    private static Map<String, Number> validator = new HashMap<>();

    public Validator() {
        fillValidator();
    }

    public static boolean criteriaValidator(Criteria criteria) {
        Map<String, Object> criteriaMap = criteria.getCriteria();
        for (String value : criteriaMap.keySet()) {
            if (criteriaMap.get(value) instanceof Number) {
                if (validator.get(value) != null) {
                    if (!validator.get(value).equals(criteriaMap.get(value))) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    private static void fillValidator() {
        validator.put("SYSTEM_MEMORY", 1500);
        validator.put("MEMORY_ROM", 16000);
        validator.put("NUMBER_OF_SPEAKERS", 4);
        validator.put("CORD_LENGTH", 5);
        validator.put("WIDTH", 80);
        validator.put("HEIGHT", 250);
        validator.put("DEPTH", 2000);
        validator.put("CAPACITY", 33);
        validator.put("WEIGHT", 35);
        validator.put("DISPLAY_INCHES", 16);
        validator.put("BATTERY_CAPACITY", 5);
        validator.put("MOTOR_SPEED_REGULATION", 3000);
    }
}

//you may add your own new classes