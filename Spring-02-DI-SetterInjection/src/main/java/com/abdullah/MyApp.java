package com.abdullah;

import com.abdullah.interfaces.Course;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

    public static void main(String[] args) {
        ApplicationContext container = new ClassPathXmlApplicationContext("config.xml");

        Course course = container.getBean("java", Course.class);  //or  Course course = (Course)container.getBean("Java");

        course.getTeachingHours();
    }
}
