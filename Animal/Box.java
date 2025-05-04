package Animal;
class Box<T> {
    private T content; // Generic
    
    public void put(T item) {
        content = item;
    }
    
    public T get() {
        return content;
    }
}