import java.util.ArrayList;
import java.util.List;

// Lớp trừu tượng Animals
abstract class Animals {
    protected String name;
    protected int age;

    public Animals(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract void sound();
    public abstract void move();
}

// Lớp Lion kế thừa từ Animals
class Lion extends Animals {
    public Lion(String name, int age) {
        super(name, age);
    }

    @Override
    public void sound() {
        System.out.println(name + " says: Roar!");
    }

    @Override
    public void move() {
        System.out.println(name + " is running.");
    }
}

// Lớp Elephant kế thừa từ Animals
class Elephant extends Animals {
    public Elephant(String name, int age) {
        super(name, age);
    }

    @Override
    public void sound() {
        System.out.println(name + " says: Trumpet!");
    }

    @Override
    public void move() {
        System.out.println(name + " is walking.");
    }
}


class Zoo {
    private List<Animals> animals;

    public Zoo() {
        this.animals = new ArrayList<>();
    }

    public void addAnimal(Animals animal) {
        animals.add(animal);
    }

    public void showAnimals() {
        if (animals.isEmpty()) {
            System.out.println("The zoo has no animals.");
        } else {
            System.out.println("Animals in the zoo:");
            for (Animals animal : animals) {
                System.out.println("Name: " + animal.name + ", Age: " + animal.age);
                animal.sound();
                animal.move();
                System.out.println();
            }
        }
    }
}


public class Bai6 {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();

        Lion lion = new Lion("Simba", 5);
        Elephant elephant = new Elephant("Dumbo", 10);

        zoo.addAnimal(lion);
        zoo.addAnimal(elephant);

        zoo.showAnimals();
    }
}
