package finalTask.packAnimals;

import finalTask.Animal;
import finalTask.AutoCreatable;
import finalTask.Command;
import finalTask.PackAnimal;

import java.util.List;

public class Camel extends PackAnimal implements AutoCreatable {
    public Camel(String name, int age, int id) {
        super(name, age, id);
    }

    public Camel(String name, int age, int id, List<Command> commandList) {
        super(name, age, id, commandList);
    }

    public Camel() {
    }

    @Override
    public Animal create(String name, int age, int id) {
        return new Camel(name, age, id);
    }
}
