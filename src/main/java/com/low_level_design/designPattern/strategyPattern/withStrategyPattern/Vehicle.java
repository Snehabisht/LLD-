package com.low_level_design.designPattern.strategyPattern.withStrategyPattern;

import com.low_level_design.designPattern.strategyPattern.withStrategyPattern.strategy.DriveStrategy;

public class Vehicle {

    DriveStrategy driveStrategy;

    //cnstr injection
    Vehicle(DriveStrategy driveStrategy){
        this.driveStrategy = driveStrategy;
    }

    public void drive() {
        driveStrategy.drive();
    }

    public static void main(String[] args) {
        Vehicle vehicle1 =  new PassengerVehicle();
        vehicle1.drive(); //normal

        Vehicle vehicle2 =  new OffRoadVehicle();
        vehicle2.drive(); //special
    }
}
