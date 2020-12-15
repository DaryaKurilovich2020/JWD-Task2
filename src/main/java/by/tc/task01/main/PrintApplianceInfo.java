package by.tc.task01.main;

import by.tc.task01.entity.Appliancable;

import java.io.*;

public class PrintApplianceInfo {
    private static OutputStreamWriter outputStreamWriter;
    private static final BufferedWriter bufferedWriter=new BufferedWriter(outputStreamWriter);

    public static void print(Appliancable appliancable) throws IOException {
        bufferedWriter.write(appliancable.toString());
        bufferedWriter.close();
    }

    // you may add your own code here

}
