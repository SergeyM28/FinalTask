package finalTask;

import finalTask.packAnimals.Camel;
import finalTask.packAnimals.Donkey;
import finalTask.packAnimals.Horse;
import finalTask.pets.Cat;
import finalTask.pets.Dog;
import finalTask.pets.Hamster;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AnimalFactory {
    private int age;
    private String name;

    IdCounter idc = new IdCounter();
    public List<PackAnimal> availablePackAnimals = new ArrayList<>(Arrays.asList(new Camel(), new Donkey(), new Horse()));
    public List<Pet> availablePets = new ArrayList<>(Arrays.asList(new Cat(), new Dog(), new Hamster()));

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public IdCounter getIdc() {
        return idc;
    }

    public List<PackAnimal> getAvailablePackAnimals() {
        return availablePackAnimals;
    }

    public void setAvailablePackAnimals(List<PackAnimal> availablePackAnimals) {
        this.availablePackAnimals = availablePackAnimals;
    }

    public List<Pet> getAvailablePets() {
        return availablePets;
    }

    public void setAvailablePets(List<Pet> availablePets) {
        this.availablePets = availablePets;
    }
}
