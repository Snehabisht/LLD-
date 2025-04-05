package com.low_level_design.designPattern.strategyPattern.withStrategyPattern;

import com.low_level_design.designPattern.strategyPattern.withStrategyPattern.strategy.NormalDriveStrategy;

public class PassengerVehicle extends Vehicle {
    PassengerVehicle() {
        super(new NormalDriveStrategy());
        System.out.println("in passenger");
    }
}
