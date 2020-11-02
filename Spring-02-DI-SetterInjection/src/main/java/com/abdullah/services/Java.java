package com.abdullah.services;

import com.abdullah.interfaces.Course;
import com.abdullah.interfaces.ExtraSessions;

public class Java implements Course {

    private  OfficeHours officeHours;

    public OfficeHours getOfficeHours() {
        return officeHours;
    }

    public void setOfficeHours(OfficeHours officeHours) {
        this.officeHours = officeHours;
    }

    @Override
    public void getTeachingHours() {
        System.out.println("Weekly teaching hours : "+(20 + officeHours.getHours()));
    }
}
