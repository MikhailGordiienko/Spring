package org.example.city;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


public class JavaConfiguredCity {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(CityConfiguration.class);
        City city = applicationContext.getBean(City.class);
        System.out.println(city);
    }
}

@Configuration
class CityConfiguration {
    @Bean
    public ElectricitySystem electricitySystem() {return new ElectricitySystem();}
    @Bean
    public PipelineSystem pipelineSystem() {return new PipelineSystem();}
    @Bean
    public IndustrialDistrict industrialDistrict() {return new IndustrialDistrict();}
    @Bean
    public City city(ElectricitySystem electricitySystem,
                     PipelineSystem pipelineSystem,
                     IndustrialDistrict industrialDistrict) {
        return new City(electricitySystem, pipelineSystem, industrialDistrict);
    }
}
