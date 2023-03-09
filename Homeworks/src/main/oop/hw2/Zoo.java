package oop.hw2;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

    private final List<Animal> animals;

    public Zoo() {
        this.animals = new ArrayList<>();
    }

    public void add(Animal animal) {
        this.animals.add(animal);
    }

    public void remove(int index) {
        if (!this.animals.isEmpty())
            this.animals.remove(index);
    }

    public void getInfo(int index) {
        final var animal = this.animals.get(index);
        if (animal != null) {
            System.out.println(animal.getInfo());
            return;
        }
        System.out.println("Нет информации о животном с номером " + index);
    }

    public void makeSound(int index) {
        final var animal = this.animals.get(index);
        if (animal != null) {
            animal.makeSound();
            return;
        }
        System.out.println("Нет животного с номером " + index);
    }

    public void getAnimalsInfo() {
        StringBuilder sb = new StringBuilder();
        for (Animal animal : this.animals) {
            sb.append(animal.getInfo()).append("\n");
        }
        System.out.println(sb);
    }

    public void makeAllAnimalsSound() {
        for (Animal animal : this.animals) {
            animal.makeSound();
        }
    }

}
