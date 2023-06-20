package finalTask;

public abstract class Animal implements AutoCreatable{
    private String name;
    private int age;

    private int id;

    public Animal(String name, int age, int id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public Animal() {
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getId() {
        return id;
    }


}
