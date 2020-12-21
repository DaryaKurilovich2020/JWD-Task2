package by.tc.task01.dao;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ApplianceReader {
    private static File appliancesFile = new File("appliances_db.txt");
    private static BufferedReader reader;

    public ApplianceReader() throws FileNotFoundException {
        reader = new BufferedReader(new FileReader(appliancesFile));
    }

    public List<String> read() throws IOException {
        List<String> lines = new ArrayList<>();
        String line;
        while ((line = reader.readLine()) != null) {
            lines.add(line);
        }
        return lines;
    }
}
