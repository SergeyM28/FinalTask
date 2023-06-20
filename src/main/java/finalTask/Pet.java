package finalTask;

import java.util.ArrayList;
import java.util.List;

public class Pet extends Animal implements AutoCreatable{

    private List<Command>commandList;

    public Pet(String name, int age, int id) {
        super(name, age, id);
        this.commandList = new ArrayList<>();
    }

    public Pet(String name, int age, int id, List<Command>commandList) {
        super(name, age, id);
        this.commandList = commandList;
    }

    public Pet() {
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
        return new Pet(name, age, id);
    }

    public List<Command> getCommandList() {
        return commandList;
    }

    public String getCommands(){
        String temp = "";
        for (Command elem : commandList){
            temp += elem.getCommandName() + " ";
        }
        return temp;
    }
}
