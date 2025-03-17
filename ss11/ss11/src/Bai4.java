
interface Animal {
    void makeSound();
}

class Dog implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof Woof");
    }
}


class Cat implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow Meow");
    }
}


public class Bai4 {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        System.out.println("\nDog makes sound:");
        myDog.makeSound();

        System.out.println("\nCat makes sound:");
        myCat.makeSound();
    }
}
