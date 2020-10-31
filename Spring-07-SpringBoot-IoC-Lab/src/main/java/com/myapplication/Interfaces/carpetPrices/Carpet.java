package com.myapplication.Interfaces.carpetPrices;

import com.myapplication.enums.City;

import java.math.BigDecimal;

public interface Carpet {

    // square feet price
    //BigDecimal(class) --> rounding floating number for us (for double and float )

    BigDecimal getSqFtPrice(City city);

}
