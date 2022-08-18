package org.example.city;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationConfigurationXmlCity {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext xmlApplicationContext =
                new ClassPathXmlApplicationContext("city-annotation-context.xml");
        City city = xmlApplicationContext.getBean(City.class);
        System.out.println(city);
    }
}
