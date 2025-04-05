package com.low_level_design.designPattern.strategyPattern.withStrategyPattern;

import com.low_level_design.designPattern.strategyPattern.withStrategyPattern.strategy.SpecialDriveStrategy;

public class SportsVehicle extends Vehicle {
    SportsVehicle() {
        super(new SpecialDriveStrategy());
    }
}
