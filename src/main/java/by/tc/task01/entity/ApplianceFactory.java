package by.tc.task01.entity;

import java.util.List;

public class ApplianceFactory {
    public Appliance create(List<String> parsedApplianceData) {
        Appliance appliance = null;
        String groupName = parsedApplianceData.get(0);
        switch (groupName) {
            case "Oven":
                appliance = ApplianceFactory.createOven(parsedApplianceData);
            case "Refrigerator":
                appliance = ApplianceFactory.createRefrigerator(parsedApplianceData);
            case "Speakers":
                appliance = ApplianceFactory.createSpeakers(parsedApplianceData);
            case "VacuumCleaner":
                appliance = ApplianceFactory.createVacuumCleaner(parsedApplianceData);
            case "TabletPC":
                appliance = ApplianceFactory.createTabletPC(parsedApplianceData);
            case "Laptop":
                appliance = ApplianceFactory.createLaptop(parsedApplianceData);
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
        int freezeCapacity = Integer.parseInt(data.get(3));
        int overallCapacity = Integer.parseInt(data.get(4));
        double height = Double.parseDouble(data.get(5));
        double width = Double.parseDouble(data.get(6));
        return new Refrigerator(powerConsumption, weight, freezeCapacity, overallCapacity, height, width);
    }

    private static Appliance createLaptop(List<String> data) {
        int batteryCapacity = Integer.parseInt(data.get(1));
        OS os = OS.valueOf(data.get(2));
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
        int motorSpeedRegulation = Integer.parseInt(data.get(2));
        double cleaningWidth = Double.parseDouble(data.get(3));
        Filter filterType = Filter.valueOf(data.get(4));
        String bagType = data.get(5);
        String wandType = data.get(6);
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
