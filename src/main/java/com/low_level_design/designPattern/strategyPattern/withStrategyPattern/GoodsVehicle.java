package com.low_level_design.designPattern.strategyPattern.withStrategyPattern;

import com.low_level_design.designPattern.strategyPattern.withStrategyPattern.strategy.NormalDriveStrategy;

public class GoodsVehicle extends Vehicle {
    GoodsVehicle() {
        super(new NormalDriveStrategy());
    }
}
