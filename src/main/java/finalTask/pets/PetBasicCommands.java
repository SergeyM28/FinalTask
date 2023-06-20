package finalTask.pets;

import finalTask.Command;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PetBasicCommands {
    private List<Command> petBasicCommands = new ArrayList<>(Arrays.asList(new Command("голос"),
            new Command("лежать"), new Command("лапу")));

    public String printCommands() {
        String temp = "";
        int count = 1;
        for (Command elem : petBasicCommands) {
            temp += count + " " + elem.getCommandName() + "\n";
            count++;
        }
        return temp;
    }
    public Command getCommand(int number) {
        return petBasicCommands.get(number - 1);
    }
}
