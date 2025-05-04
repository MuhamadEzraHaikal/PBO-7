package Animal;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Class & Object
        animal dog = new animal("Dog") {};
        dog.makeSound();
        
        // Inheritance
        Cat cat = new Cat();
        cat.makeSound();
        
        // Polymorphism
        animal myCat = new Cat();
        myCat.makeSound();
        
        // Collection
        ArrayList<animal> animals = new ArrayList<>();
        animals.add(dog);
        animals.add(cat);
        
        System.out.println("\nAll Animals:");
        for(animal a : animals) {
            a.makeSound(); // Polymorphism
        }
    }
}