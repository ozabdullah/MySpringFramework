package com.abdullah.services;

import com.abdullah.interfaces.Course;
import com.abdullah.interfaces.ExtraSessions;

public class Java implements Course {

    //OfficeHours officeHours;
    ExtraSessions extraSessions;

    public Java(ExtraSessions extraSessions) {
        this.extraSessions = extraSessions;
    }

    @Override
    public void getTeachingHours() {
        System.out.println("Weekly teaching hours : "+(20 + extraSessions.getHours()));
    }
}
