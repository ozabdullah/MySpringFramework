package com.abdullah;

import com.abdullah.interfaces.Course;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

    public static void main(String[] args) {
        ApplicationContext container = new ClassPathXmlApplicationContext("config.xml");

       // Course course = new Java(); regular way creating obj

        Course course = container.getBean("java", Course.class);  //or  Course course = container.getBean("Java", Course.class);

        course.getTeachingHours();

    }
}
