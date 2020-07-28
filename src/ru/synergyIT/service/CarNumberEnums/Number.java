package ru.synergyIT.service.CarNumberEnums;

import java.util.Random;

public enum Number {
    one, two, three, four, five, six, eight, nine;

    public static String getRandomNum(){
        Number[] values = Number.values();
        int length = values.length;
        int randIndex = new Random().nextInt(length);
        return String.valueOf(randIndex);
    }
}
