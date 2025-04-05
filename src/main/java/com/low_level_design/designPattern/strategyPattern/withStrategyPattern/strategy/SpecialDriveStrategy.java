package com.low_level_design.designPattern.strategyPattern.withStrategyPattern.strategy;

public class SpecialDriveStrategy implements DriveStrategy {
    @Override
    public void drive() {
        System.out.println("special drive capability");
    }
}
