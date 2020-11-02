package com.myapplication.services.floor;

import com.myapplication.interfaces.floorTypes.Floor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class LivingRoom implements Floor {

    @Value("${width}")
    BigDecimal width;

    @Value("${length}")
    BigDecimal length;

    @Override
    public BigDecimal getArea() {
        return width.multiply(length);
    }
}
