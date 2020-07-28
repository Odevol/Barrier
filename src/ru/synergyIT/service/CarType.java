package ru.synergyIT.service;

import java.util.Random;

public enum CarType {
MotorCar, Truck;

    public static CarType getRandomType(){
        CarType[] values = CarType.values();
        int length = values.length;
        int randIndex = new Random().nextInt(length);
        return values[randIndex];
    }
}
