package com.abdullah;

import com.abdullah.interfaces.Course;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

    public static void main(String[] args) {
        ApplicationContext container = new ClassPathXmlApplicationContext("config.xml");

        Course course1 = container.getBean("java", Course.class);  //or  Course course = (Course)container.getBean("Java");

        Course course2 = container.getBean("java", Course.class);



        System.out.println("Pointing to the same object: "+ (course1==course2));

        System.out.println("Memory location for course1 is "+ course1);

        System.out.println("Memory location for course2 is "+ course2);

    }
}
