package finalTask.pets;

import finalTask.Animal;
import finalTask.AutoCreatable;
import finalTask.Command;
import finalTask.Pet;

import java.util.List;

public class Dog extends Pet implements AutoCreatable {
    public Dog(String name, int age, int id) {
        super(name, age, id);
    }

    public Dog(String name, int age, int id, List<Command> commandList) {
        super(name, age, id, commandList);
    }

    public Dog() {
    }

    @Override
    public Animal create(String name, int age, int id) {
        return new Dog(name, age, id);
    }
}
