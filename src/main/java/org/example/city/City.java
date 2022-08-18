package org.example.city;

import org.springframework.beans.factory.annotation.Autowired;

public class City {
    private ElectricitySystem electricitySystem;
    private PipelineSystem pipelineSystem;
    private IndustrialDistrict industrialDistrict;

    public City(@Autowired ElectricitySystem electricitySystem,
                @Autowired PipelineSystem pipelineSystem,
                @Autowired IndustrialDistrict industrialDistrict) {
        this.electricitySystem = electricitySystem;
        this.pipelineSystem = pipelineSystem;
        this.industrialDistrict = industrialDistrict;
    }

    @Override
    public String toString() {
        return "City{" +
                "electricitySystem=" + electricitySystem +
                ", pipelineSystem=" + pipelineSystem +
                ", industrialDistrict=" + industrialDistrict +
                '}';
    }
}
