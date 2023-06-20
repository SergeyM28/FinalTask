package finalTask;

import java.util.ArrayList;
import java.util.List;

public class PackAnimal extends Animal implements AutoCreatable{

    private List<Command> commandList;

    public PackAnimal(String name, int age, int id) {
        super(name, age, id);
        this.commandList = new ArrayList<>();
    }

    public PackAnimal(String name, int age, int id, List<Command> commandList) {
        super(name, age, id);
        this.commandList = commandList;
    }

    public PackAnimal() {
    }

    public void teachCommand(Command command){
        this.commandList.add(command);
    }

    public void doCommand(Command command){
        if(commandList.contains(command)) {
            System.out.println(getName() + "Выполняет команду" + command.getCommandName());
        }else {
            System.out.println(getName() + "не умеет выполнять" + command.getCommandName());
        }
    }

    @Override
    public Animal create(String name, int age, int id) {
        return new PackAnimal(name, age, id);
    }

    public String getCommands(){
        String temp = "";
        for (Command elem : commandList){
            temp += elem.getCommandName() + " ";
        }
        return temp;
    }

}
