package by.tc.task01.main;

import by.tc.task01.entity.Appliance;

import java.io.*;
import java.util.List;

public class PrintApplianceInfo {
    private static OutputStreamWriter outputStreamWriter;
    private static final BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);

    public static void print(List<Appliance> appliances) throws IOException {
        for (Appliance appliance : appliances) {
            bufferedWriter.write(appliance.toString());
        }
        bufferedWriter.close();
    }

    // you may add your own code here

}
