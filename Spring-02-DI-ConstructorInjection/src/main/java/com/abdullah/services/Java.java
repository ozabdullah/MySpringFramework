package com.abdullah.services;

import com.abdullah.interfaces.Course;

public class Java implements Course {
    @Override
    public void getTeachingHours() {
        System.out.println("Weekly teaching hours : 20");
    }
}
