package ru.synergyIT.service.exeption;

public class WrongSizeExeption extends RuntimeException{

    public WrongSizeExeption(String message){
        super(message);
    }
}
