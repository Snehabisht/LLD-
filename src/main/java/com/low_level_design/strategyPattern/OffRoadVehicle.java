package com.low_level_design.withoutStrategyPattern;

public class OffRoadVehicle extends Vehicle{
    @Override
    public void drive() {
        System.out.println("sports drive"); //drive capability repeats
    }
}
