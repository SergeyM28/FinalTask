package finalTask.packAnimals;

import finalTask.Animal;
import finalTask.AutoCreatable;
import finalTask.Command;
import finalTask.PackAnimal;

import java.util.List;

public class Horse extends PackAnimal implements AutoCreatable {

    public Horse(String name, int age, int id) {
        super(name, age, id);
    }

    public Horse() {
    }

    public Horse(String name, int age, int id, List<Command> commandList) {
        super(name, age, id, commandList);
    }

    @Override
    public Animal create(String name, int age, int id) {
        return new Horse(name, age, id);
    }
}
