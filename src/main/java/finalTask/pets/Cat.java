package finalTask.pets;

import finalTask.Animal;
import finalTask.AutoCreatable;
import finalTask.Command;
import finalTask.Pet;

import java.util.List;

public class Cat extends Pet implements AutoCreatable {
    public Cat(String name, int age, int id) {
        super(name, age, id);
    }

    public Cat(String name, int age, int id, List<Command> commandList) {
        super(name, age, id, commandList);
    }

    public Cat() {
    }

    @Override
    public Animal create(String name, int age, int id) {
        return new Cat(name, age, id);
    }
}
