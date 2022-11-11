package org.example;

import org.joda.time.DateTime;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TaxiTest {

    private Taxi taxi;

    @BeforeEach
    public void setup(){
        taxi = new Taxi();
    }
    @Test
    public void  isBookedTest(){
        boolean result = taxi.isBooked();
        assertEquals(true,result);
    }



    @Test
    public void calcCost(){
        DateTime st = new DateTime(2022,11,11,10,10);
        DateTime et = new DateTime(2022, 11,11,10,50);
        double result = taxi.calcCost(st,et);
        assertEquals(37.5, result);
    }



}
