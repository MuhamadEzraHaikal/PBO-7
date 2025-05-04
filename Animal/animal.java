package Animal;
abstract class animal {
    private String name;
    
    public animal(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public void makeSound() {
        System.out.println(getName() + " says: Animal sound!");
    }
}