package com.abdullah;

import com.abdullah.interfaces.Course;
import org.springframework.stereotype.Component;

@Component
public class Java implements Course {
    @Override
    public int getTeachingHours() {
        return 0;
    }
}
