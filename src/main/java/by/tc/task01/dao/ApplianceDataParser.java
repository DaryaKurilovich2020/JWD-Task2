package by.tc.task01.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class ApplianceDataParser {
    public List<String> parseAndFilter(String data) {
        List<String> parsedAndFilteredData = new ArrayList<>();
        List<String> tmp = parse(data);
        for (int i = 0; i < tmp.size(); i++) {
            if (i % 2 == 0) {
                parsedAndFilteredData.add(tmp.get(i));
            }
        }
        return parsedAndFilteredData;
    }

    public List<String> parse(String data) {
        List<String> parsedData = new ArrayList<>();
        StringTokenizer tokenizer = new StringTokenizer(data, " :,\t=");
        while (tokenizer.hasMoreTokens()) {
            parsedData.add(tokenizer.nextToken());
        }
        return parsedData;
    }
}
