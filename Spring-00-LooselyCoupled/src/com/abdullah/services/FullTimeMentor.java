package com.abdullah.services;

import com.abdullah.implementation.Mentor;

public class FullTimeMentor implements Mentor {
    @Override
    public void createAccount() {
        System.out.println("Full Time Mentor Account is created");
    }
}
