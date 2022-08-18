package org.example.city;

public class TraditionalConfiguredCity {
    public static void main(String[] args) {
        ElectricitySystem electricitySystem = new ElectricitySystem();
        PipelineSystem pipelineSystem = new PipelineSystem();
        IndustrialDistrict industrialDistrict = new IndustrialDistrict();

        City city = new City(electricitySystem, pipelineSystem, industrialDistrict);
        System.out.println(city);
    }
}
