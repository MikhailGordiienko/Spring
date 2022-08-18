package org.example.city;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XmlConfiguredCity {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext xmlApplicationContext =
                new ClassPathXmlApplicationContext("city-context.xml");

        City city = xmlApplicationContext.getBean(City.class);
//        City city2 = (City) xmlApplicationContext.getBean("city");

        System.out.println(city);
    }
}
