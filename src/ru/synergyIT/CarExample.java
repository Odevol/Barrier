package ru.synergyIT;

import ru.synergyIT.service.CarType;
import ru.synergyIT.service.Car;
import ru.synergyIT.service.exeption.WrongSizeExeption;
import ru.synergyIT.service.exeption.WrongSpeedExeption;
import ru.synergyIT.service.CarNumberEnums.Number;
import ru.synergyIT.service.CarNumberEnums.Letter;

import java.util.Random;

public class CarExample {
    private static final int maxSpeedFirst = 80;
    private static final int maxSpeedSecond = 100;
    private static final double maxHeight = 4.0;
    private static final double maxWidth = 2.5;
    private static final double maxWeight = 8.0;

    public static void main(String[] args) {
        Random random = new Random();

        Car car = new Car();
        car.setSpeed(random.nextInt(120 + 1));
        car.setHeight(random.nextInt(60) / 10 + 0.1);
        car.setWidth(random.nextInt(40) / 10 + 0.1);
        car.setWeight(random.nextInt(120) / 10 + 0.1);
        car.setType(CarType.getRandomType());
        String carNumber = Letter.getRandomLetter() + Number.getRandomNum() + Number.getRandomNum() + Number.getRandomNum() + Letter.getRandomLetter() + Letter.getRandomLetter();
        car.setCarNumber(carNumber);

        try {
            if (checkSize(car)){
                System.out.println(car.getType() + " под номером " +car.getCarNumber() + ", проезд открыт");
                try {
                    if(checkSpeed(car)){
                        System.out.println("Скорость в допустимых пределах");
                        System.out.println("Скорость " + car.getSpeed());
                    }
                }

                catch (WrongSpeedExeption e){
                    System.out.println("Нарушение " + car.getCarNumber());
                    System.out.println("Скорость " + car.getSpeed());
                    e.printStackTrace();
                }
            }

        } catch (WrongSizeExeption e) {
            System.out.println(car.getType() + " под номером " +car.getCarNumber() + ", проезд закрыт");
            e.printStackTrace();
        }
        finally {
            System.out.println("Высота автомобиля " + car.getHeight());
            System.out.println("Ширина автомобиля " + car.getWidth());
            System.out.println("Вес автомобиля " + car.getWeight());
        }
    }

    private static boolean checkSpeed(Car car){
        if(car.getSpeed() >= maxSpeedFirst){
            if(car.getSpeed() >= maxSpeedSecond) {
                throw new WrongSpeedExeption("Превышение скорости с обращением в полицию");
            }
            else {
                throw new WrongSpeedExeption("Превышение скорости");
            }
        }
        return true;
    }
    private static boolean checkSize(Car car){
        if (car.getHeight() > maxHeight) {
            throw new WrongSizeExeption("Превышена высота автомобиля");
        }
        if (car.getWidth() > maxWidth) {
            throw new WrongSizeExeption("Превышена ширина автомобиля");
        }
        if (car.getWeight() > maxWeight) {
            throw new WrongSizeExeption("Превышен вес автомобиля");
        }
        return true;
    }


}
