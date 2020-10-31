package com.myapplication.services.carpet;

import com.myapplication.Interfaces.carpetPrices.Carpet;
import com.myapplication.enums.City;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;


@Component
public class CarpetVA implements Carpet {

    private  static  final Map<City, BigDecimal> sqPriceForCity = new HashMap<>();

    static {

        sqPriceForCity.put(City.MCLEAN, new BigDecimal(4.32));
        sqPriceForCity.put(City.ARLINGTON, new BigDecimal(2.92));
        sqPriceForCity.put(City.FAIRFAX, new BigDecimal(4.65));
    }

    @Override
    public BigDecimal getSqFtPrice(City city) { // return the price

        BigDecimal defaultValue =  BigDecimal.ZERO;

        //entrySet() --> convert mep to set but inside the set it stores as a map
        //Optional ---> to not get NullPointerException
     Optional < Map.Entry<City, BigDecimal> > collect    = sqPriceForCity.entrySet().stream().filter(x -> x.getKey()==city).findFirst();

               // ternary
        return collect.isPresent() ? collect.get().getValue() : defaultValue ;
    }
}
