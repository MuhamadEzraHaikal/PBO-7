package Animal;
class Cat extends animal {
    public Cat() {
        super("Cat");
    }
    
    @Override
    public void makeSound() {
        System.out.println(getName() + " says: Meow!");
    }
}