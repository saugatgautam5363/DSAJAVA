package HomeWork;
interface Animal {
    void makeSound();
}

class Dog implements Animal {
    public void makeSound() {
        System.out.println("Dog says: Woof! Woof!");
    }
}

class Cat implements Animal {
    public void makeSound() {
        System.out.println("Cat says: Meow! Meow!");
    }
}

public class AnimalDemo {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();

        dog.makeSound();
        cat.makeSound(); 
    }
}
