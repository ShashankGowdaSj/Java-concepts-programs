package Day2;

class Box<T> {
    T value;
    void set(T value) {
        this.value = value;
    }
    T get() {
        return value;
    }
}

public class generics {
    public static void main(String[] args) {
        Box<String> stringBox = new Box<>();
        stringBox.set("Hello");
        System.out.println("Value: " + stringBox.get());
        Box<Integer> intBox = new Box<>();
        intBox.set(50);
        System.out.println("Value: " + intBox.get());
    }
}