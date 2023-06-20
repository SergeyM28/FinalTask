package finalTask.pets;

import finalTask.Animal;
import finalTask.AutoCreatable;
import finalTask.Command;
import finalTask.Pet;

import java.util.List;

public class Hamster extends Pet implements AutoCreatable {
    public Hamster(String name, int age, int id) {
        super(name, age, id);
    }

    public Hamster(String name, int age, int id, List<Command> commandList) {
        super(name, age, id, commandList);
    }

    public Hamster() {
    }

    @Override
    public Animal create(String name, int age, int id) {
        return new Hamster(name, age, id);
    }
}
