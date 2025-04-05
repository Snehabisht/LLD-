package com.low_level_design.designPattern.strategyPattern.withoutStrategyPattern;

public class OffRoadVehicle extends Vehicle{
    @Override
    public void drive() {
        System.out.println("sports drive capability"); //drive capability repeats
    }
}
