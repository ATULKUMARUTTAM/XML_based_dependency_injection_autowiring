package org.atuluttam;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CarService {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        ApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
        Car newcar = (Car) ctx.getBean("car");

        newcar.startcar();

    }
}