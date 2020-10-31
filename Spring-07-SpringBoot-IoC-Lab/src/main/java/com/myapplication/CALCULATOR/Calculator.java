package com.myapplication.CALCULATOR;

import com.myapplication.Interfaces.carpetPrices.Carpet;
import com.myapplication.Interfaces.floorTypes.Floor;
import com.myapplication.enums.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class Calculator {

    @Qualifier("carpetVA") //which bean -->
    @Autowired
    private Carpet carpet;

    @Qualifier("kitchen")
    @Autowired
    private Floor floor;

    public String getTotalCarpetCost(City city) throws Exception { // get rid of exception


        BigDecimal cost = carpet.getSqFtPrice(city).multiply(floor.getArea());

        if(cost.compareTo(BigDecimal.ZERO)==0){
            throw new Exception("This city does not exist"); // manually throw an exception
        }

                return "Total cost for carpet : "+ cost;
    }
}
