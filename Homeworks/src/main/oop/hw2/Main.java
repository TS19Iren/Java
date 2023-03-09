package oop.hw2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            boolean isRunning = true;
            String userAnswer = "";
            Zoo zoo = new Zoo();
            while (isRunning) {
                System.out.println("""
                        1.Add animal
                        2.Remove animal by index
                        3.Show all animals in zoo
                        4.Make all animals sound
                        5.Show animal by index
                        6.Make sound by index
                        0.Exit
                        """);
                userAnswer = scanner.nextLine();
                if (!userAnswer.equals("0")) {
                    switch (userAnswer) {
                        case "1" -> addAnimal(scanner, zoo);
                        case "2" -> removeAnimal(scanner, zoo);
                        case "3" -> showAllAnimals(zoo);
                        case "4" -> makeAllAnimalsSound(zoo);
                        case "5" -> showAnimalByIndex(scanner, zoo);
                        case "6" -> makeSoundByIndex(scanner, zoo);


                    }
                } else {
                    isRunning = false;
                }

            }
        }
    }

    private static void makeSoundByIndex(Scanner scanner, Zoo zoo) {
        System.out.println("Enter index of  animal to make sound:");
        String userAnswer = "";
        userAnswer = scanner.nextLine();
        zoo.makeSound(Integer.parseInt(userAnswer) - 1);
    }

    private static void showAnimalByIndex(Scanner scanner, Zoo zoo) {
        System.out.println("Enter index of shown animal:");
        String userAnswer = "";
        userAnswer = scanner.nextLine();
        zoo.getInfo(Integer.parseInt(userAnswer) - 1);

    }

    private static void makeAllAnimalsSound(Zoo zoo) {
        zoo.makeAllAnimalsSound();
    }

    private static void showAllAnimals(Zoo zoo) {
        zoo.getAnimalsInfo();
    }

    private static void removeAnimal(Scanner scanner, Zoo zoo) {
        zoo.getAnimalsInfo();
        System.out.println("Enter index of removing animal: ");
        String userAnswer = "";
        userAnswer = scanner.nextLine();

        zoo.remove(Integer.parseInt(userAnswer) - 1);
    }

    private static void addAnimal(Scanner scanner, Zoo zoo) {
        System.out.println("""
                Who are you going to add?
                1.Cat
                2.Chicken
                3.Dog
                4.Stork
                5.Wolf
                """);
        String userAnswer = "";
        userAnswer = scanner.nextLine();
        switch (userAnswer) {
            case "1" -> {
                Animal cat = RandomAnimalGenerator.createCat();
                zoo.add(cat);
            }
            case "2" -> {
                Animal chicken = RandomAnimalGenerator.createChicken();
                zoo.add(chicken);
            }
            case "3" -> {
                Animal dog = RandomAnimalGenerator.createDog();
                zoo.add(dog);
            }
            case "4" -> {
                Animal stork = RandomAnimalGenerator.createStork();
                zoo.add(stork);
            }
            case "5" -> {
                Animal wolf = RandomAnimalGenerator.createWolf();
                zoo.add(wolf);
            }
        }
    }
}
