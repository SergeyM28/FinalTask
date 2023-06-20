package finalTask.packAnimals;

import finalTask.Command;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PackAnimalBasicCommands {
    private List<Command> packAnimalBasicCommands = new ArrayList<>(Arrays.asList(new Command("пасись"),
            new Command("в стойло")));
    public String printCommands() {
        String temp = "";
        int count = 1;
        for (Command elem : packAnimalBasicCommands) {
            temp += count + " " + elem.getCommandName() + "\n";
            count++;
        }
        return temp;
    }

    public Command getCommand(int number) {
        return packAnimalBasicCommands.get(number - 1);
    }
}
