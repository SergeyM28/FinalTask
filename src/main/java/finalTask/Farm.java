package finalTask;

import java.util.ArrayList;
import java.util.List;

public class Farm {
    private final IdCounter idCounter = new IdCounter();
    private List<Pet> petList;
    private List<PackAnimal> packAnimalList;

    public void addPackAnimal(PackAnimal pa){
        this.packAnimalList.add(pa);
    }

    public void addPet(Pet pet){
        this.petList.add(pet);
    }

    public Farm() {
        this.petList = new ArrayList<>();
        this.packAnimalList = new ArrayList<>();
    }

    public List<Pet> getPetList() {
        return petList;
    }

    public List<PackAnimal> getPackAnimalList() {
        return packAnimalList;
    }

    public String getFullList(){
        return getAllPets() + getAllPackAnimals();
    }
    public String getAllPets(){
        String temp = "";
        for (Pet elem : petList){
            temp += elem.getId()+ " " + elem.getClass().getSimpleName() + " " + elem.getName() +
                    ", возраст " + elem.getAge() + " лет, знает команды: " + elem.getCommands() + "\n";
        }
        return temp;
    }
    public String getAllPackAnimals(){
            String temp = "";
            for (PackAnimal elem : packAnimalList){
                temp += elem.getId()+ " " + elem.getClass().getSimpleName()  + " " + elem.getName() +
                        ", возраст " + elem.getAge() + " лет, знает команды: " + elem.getCommands() + "\n";
            }
            return temp;
        }
    public int findPetIndexById(int number){
        int result = -1;
        for (Pet elem : petList){
            if(elem.getId() == number){
                result = petList.indexOf(elem);
            }
        }return result;
    }
    public int findPackAnimalIndexById(int number){
        int result = -1;
        for (PackAnimal elem : packAnimalList){
            if(elem.getId() == number){
                result = packAnimalList.indexOf(elem);
            }
        }return result;
    }

    public void teachPackAnimal(int index, Command command){
        packAnimalList.get(index).teachCommand(command);
    }
    public void teachPet(int id, Command command){
        petList.get(id).teachCommand(command);
    }
}
