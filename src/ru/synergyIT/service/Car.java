package ru.synergyIT.service;

public class Car {

    private int speed;
    private double height;
    private double width;
    private double weight;
    private String carNumber;
    private CarType type;

    public Car(){}

    public String getType() {
        String rusType;
        switch (type){
            case Truck -> rusType = "Грузовой автомобиль";
            case MotorCar -> rusType = "Легковой автомобиль";
            default -> throw new IllegalStateException("Unexpected value: " + type);
        }
        return rusType;
    }

    public void setType(CarType type) {
        this.type = type;
    }

       public String getCarNumber() {
        return this.carNumber;
    }

    public void setCarNumber(String carNumber){
        this.carNumber = carNumber;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
