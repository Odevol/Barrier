package ru.synergyIT.service.exeption;

public class WrongSpeedExeption extends RuntimeException{

    public WrongSpeedExeption (String message){
        super (message);
    }
}
