package by.tc.task01.main;

import by.tc.task01.entity.Appliance;

import java.io.*;
import java.util.List;

public class PrintApplianceInfo {
    public static void print(List<Appliance> appliances) throws IOException {
        for (Appliance appliance : appliances) {
            System.out.println(appliance.toString());
        }
    }

    // you may add your own code here

}
