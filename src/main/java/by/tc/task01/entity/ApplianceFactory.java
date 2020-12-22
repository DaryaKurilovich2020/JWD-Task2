package by.tc.task01.entity;

import java.util.List;

public class ApplianceFactory {
    public Appliance create(List<String> parsedApplianceData) {
        Appliance appliance = null;
        if (!parsedApplianceData.isEmpty()) {
            String groupName = parsedApplianceData.get(0);
            switch (groupName) {
                case "Oven":
                    appliance = ApplianceFactory.createOven(parsedApplianceData);
                    break;

                case "Refrigerator":
                    appliance = ApplianceFactory.createRefrigerator(parsedApplianceData);
                    break;

                case "Speakers":
                    appliance = ApplianceFactory.createSpeakers(parsedApplianceData);
                    break;

                case "VacuumCleaner":
                    appliance = ApplianceFactory.createVacuumCleaner(parsedApplianceData);
                    break;

                case "TabletPC":
                    appliance = ApplianceFactory.createTabletPC(parsedApplianceData);
                    break;

                case "Laptop":
                    appliance = ApplianceFactory.createLaptop(parsedApplianceData);
                    break;

            }
        }
        return appliance;
    }

    private static Appliance createOven(List<String> data) {
        int powerConsumption = Integer.parseInt(data.get(1));
        double weight = Double.parseDouble(data.get(2));
        int capacity = Integer.parseInt(data.get(3));
        double depth = Double.parseDouble(data.get(4));
        double height = Double.parseDouble(data.get(5));
        double width = Double.parseDouble(data.get(6));
        return new Oven(powerConsumption, weight, capacity, depth, height, width);
    }

    private static Appliance createRefrigerator(List<String> data) {
        int powerConsumption = Integer.parseInt(data.get(1));
        double weight = Double.parseDouble(data.get(2));
        double freezerCapacity = Double.parseDouble(data.get(3));
        double overallCapacity = Double.parseDouble(data.get(4));
        double height = Double.parseDouble(data.get(5));
        double width = Double.parseDouble(data.get(6));
        return new Refrigerator(powerConsumption, weight, freezerCapacity, overallCapacity, height, width);
    }

    private static Appliance createLaptop(List<String> data) {
        double batteryCapacity = Double.parseDouble(data.get(1));
        String os = data.get(2);
        int memoryRom = Integer.parseInt(data.get(3));
        int systemMemory = Integer.parseInt(data.get(4));
        double cpu = Double.parseDouble(data.get(5));
        double displayInches = Double.parseDouble(data.get(6));
        return new Laptop(batteryCapacity, os, memoryRom, systemMemory, cpu, displayInches);
    }

    private static Appliance createTabletPC(List<String> data) {
        int batteryCapacity = Integer.parseInt(data.get(1));
        double displayInches = Double.parseDouble(data.get(2));
        int memoryRom = Integer.parseInt(data.get(3));
        int flashMemoryCapacity = Integer.parseInt(data.get(4));
        String color = data.get(5);
        return new TabletPC(batteryCapacity, displayInches, memoryRom, flashMemoryCapacity, color);
    }

    private static Appliance createVacuumCleaner(List<String> data) {
        int powerConsumption = Integer.parseInt(data.get(1));
        String filterType = data.get(2);
        String bagType = data.get(3);
        String wandType = data.get(4);
        int motorSpeedRegulation = Integer.parseInt(data.get(5));
        double cleaningWidth = Double.parseDouble(data.get(6));
        return new VacuumCleaner(powerConsumption, motorSpeedRegulation, cleaningWidth, filterType, bagType, wandType);
    }

    private static Appliance createSpeakers(List<String> data) {
        int powerConsumption = Integer.parseInt(data.get(1));
        int numberOfSpeakers = Integer.parseInt(data.get(2));
        String frequencyRange = data.get(4);
        double cordLength = Double.parseDouble(data.get(4));
        return new Speakers(powerConsumption, numberOfSpeakers, frequencyRange, cordLength);
    }
}
