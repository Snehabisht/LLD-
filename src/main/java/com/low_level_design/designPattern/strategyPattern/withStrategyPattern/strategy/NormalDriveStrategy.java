package com.low_level_design.designPattern.strategyPattern.withStrategyPattern.strategy;

public class NormalDriveStrategy implements DriveStrategy {

    @Override
    public void drive() {
        System.out.println("normal drive capability");
    }
}
