package oop.hw2;

import java.time.LocalDate;
import java.util.Random;

public final class RandomAnimalGenerator {

    private static final Random rnd = new Random();
    private static final String[] eyeColor = new String[]{"green", "blue", "grey"};
    private static final String[] caste = new String[]{"british", "scotish", "regdoll"};
    private static final String[] animalColor = new String[]{"black", "white", "creamy"};
    private static final String[] animalName = new String[]{"Fluffy", "Lucky", "Penny"};
    private static final String[] location = new String[]{"Asia", "Africa", "Europe"};


    public static Animal createCat() {
        return new Cat(roundRandomDoubleValue(rnd.nextDouble(0.1, 1.0)), roundRandomDoubleValue(rnd.nextDouble(0.2, 5.5)),
                eyeColor[rnd.nextInt(0, eyeColor.length - 1)],
                animalName[rnd.nextInt(0, animalName.length - 1)],
                caste[rnd.nextInt(0, caste.length - 1)],
                rnd.nextBoolean(),
                animalColor[rnd.nextInt(0, animalColor.length - 1)],
                LocalDate.now(),
                rnd.nextBoolean(),
                rnd.nextBoolean());
    }

    public static Animal createChicken() {
        return new Chicken(rnd.nextDouble(0, 0.5));
    }

    public static Animal createDog() {
        return new Dog(roundRandomDoubleValue(rnd.nextDouble(0.1, 1.0)), roundRandomDoubleValue(rnd.nextDouble(0.2, 5.5)),
                eyeColor[rnd.nextInt(0, eyeColor.length - 1)],
                animalName[rnd.nextInt(0, animalName.length - 1)],
                caste[rnd.nextInt(0, caste.length - 1)],
                rnd.nextBoolean(),
                animalColor[rnd.nextInt(0, animalColor.length - 1)],
                LocalDate.now(),
                rnd.nextBoolean());
    }

    public static Animal createStork() {
        return new Stork(rnd.nextDouble(0.1, 100.0));
    }

    public static Animal createWolf() {
        return new Wolf(roundRandomDoubleValue(rnd.nextDouble(0.1, 1.0)),
                roundRandomDoubleValue(rnd.nextDouble(0.2, 5.5)),
                eyeColor[rnd.nextInt(0, eyeColor.length - 1)],
                location[rnd.nextInt(0, location.length - 1)],
                LocalDate.now(),
                rnd.nextBoolean());

    }

    private static double roundRandomDoubleValue(double d) {

        return Math.round(d) / 100.0;
    }
}
