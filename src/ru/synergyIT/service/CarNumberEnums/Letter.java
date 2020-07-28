package ru.synergyIT.service.CarNumberEnums;

import java.util.Random;

public enum Letter {
    А, Б, В, Г, Д, Е, Ж, З, И, К, Л, М, Н, О, П, Р, С, Т, У, Ф, Х, Ц, Ч, Ш, Щ, Э, Ю, Я;

    public static String getRandomLetter(){
        Letter[] values = Letter.values();
        int length = values.length;
        int randIndex = new Random().nextInt(length);
        return String.valueOf(values[randIndex]) ;
    }
}
