package finalTask.packAnimals;

import finalTask.Animal;
import finalTask.AutoCreatable;
import finalTask.Command;
import finalTask.PackAnimal;

import java.util.List;

public class Donkey extends PackAnimal implements AutoCreatable {
    public Donkey(String name, int age, int id) {
        super(name, age, id);
    }

    public Donkey(String name, int age, int id, List<Command> commandList) {
        super(name, age, id, commandList);
    }

    public Donkey() {
    }

    @Override
    public Animal create(String name, int age, int id) {
        return new Donkey(name, age, id);
    }
}
