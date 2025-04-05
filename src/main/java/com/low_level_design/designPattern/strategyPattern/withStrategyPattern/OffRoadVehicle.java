package com.low_level_design.designPattern.strategyPattern.withStrategyPattern;

import com.low_level_design.designPattern.strategyPattern.withStrategyPattern.strategy.SpecialDriveStrategy;

public class OffRoadVehicle extends Vehicle {
    OffRoadVehicle() {
        super(new SpecialDriveStrategy());
    }
}
