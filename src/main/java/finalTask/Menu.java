package finalTask;

import finalTask.packAnimals.PackAnimalBasicCommands;
import finalTask.pets.PetBasicCommands;

import java.io.IOException;
import java.util.Scanner;

public class Menu {
    Scanner sc = new Scanner(System.in);
    Farm farm = new Farm();
    final IdCounter idc = new IdCounter();
    public AnimalFactory af = new AnimalFactory();
    PackAnimalBasicCommands pabc = new PackAnimalBasicCommands();
    PetBasicCommands pbc = new PetBasicCommands();


    private String messageStart = "Добро пожаловать в реестр домашних животных\n";
    private String messageHelp = "Список доступных команд\n" +
            "help - увидеть список доступных команд\n" +
            "add - добавить животное\n" +
            "list - вывести список животных, проживающих на ферме\n" +
            "teach - учить животное";
    private String messageAdd = "ведите цифру от 1 до 6, чтобы выбрать тип животного\n" +
            "1 - верблюд\n" +
            "2 - осел\n" +
            "3 - лошадь\n" +
            "4 - кошка\n" +
            "5 - собака\n" +
            "6 - хомяк\n" +
            "--> ";
    public void start(){
        System.out.println(messageStart);
        System.out.println(messageHelp);
        process();
    }

    public void add(){
        try {
            System.out.println("ведите имя\n" +
                    "--> ");
            af.setName(sc.nextLine());
            System.out.println("Ведите возраст в годах (целое число) \n" +
                    "--> ");
            af.setAge(sc.nextInt());
            System.out.println(messageAdd);
            int number = sc.nextInt();
            if (number < 4) {
                try (idc) {
                    farm.addPackAnimal((PackAnimal) af.availablePackAnimals.get(number - 1).create(this.af.getName(), this.af.getAge(), idc.getNewId()));
                    System.out.println("животное успешно добавлено");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } else if (number < 7 && number > 3) {
                try (idc) {
                    farm.addPet((Pet) af.availablePets.get(number - 4).create(this.af.getName(), this.af.getAge(), idc.getNewId()));
                    System.out.println("животное успешно добавлено");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } else {
                System.out.println("Введено неверное число. Попробуйте еще раз");
                add();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void teach(){
        try{
        System.out.println("ведите 1, чтобы обучить вьючное животное\n" +
                "введите 2, чтобы обучить домашнего питомца\n");
        System.out.println("--> ");
        int number = sc.nextInt();
        if(number == 1){
            System.out.println(farm.getAllPackAnimals());
            System.out.println("Выберите животное для обучения. Введите номер выбранного животного \n" +
                    "номер животного - это первое число в строке");
            System.out.println("--> ");
            number = sc.nextInt();
            System.out.println("введите номер команды, которой хотите обучить животное");
            System.out.println(pabc.printCommands());
            int number2 = sc.nextInt();
            farm.teachPackAnimal(farm.findPackAnimalIndexById(number), pabc.getCommand(number2));
            System.out.println("животное успешно обучено");
            }
        else if (number == 2) {
            System.out.println(farm.getAllPets());
            System.out.println("Выберите животное для обучения. Введите номер выбранного животного \n" +
                    "номер животного - это первое число в строке");
            System.out.println("--> ");
            number = sc.nextInt();
            System.out.println("введите номер команды, которой хотите обучить животное");
            System.out.println(pbc.printCommands());
            int number2 = sc.nextInt();
            farm.teachPet(farm.findPetIndexById(number), pbc.getCommand(number2));
            System.out.println("животное успешно обучено");
            }
        else {
            System.out.println("неверный ввод, команда не выполнена");
        }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public void process(){
        System.out.println("--> ");
        String temp = sc.nextLine();
        if (temp.equalsIgnoreCase("help")){
            System.out.println(messageHelp);
        } else if (temp.equalsIgnoreCase("add")) {
            add();
        } else if (temp.equalsIgnoreCase("list")) {
            System.out.println(farm.getFullList());
        }
        else if (temp.equalsIgnoreCase("teach")) {
            teach();
        }
        process();
    }

}
