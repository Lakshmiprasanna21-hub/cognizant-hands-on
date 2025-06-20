// Singleton Pattern Example
class Singleton {
    // static instance
    private static Singleton instance;

    // private constructor
    private Singleton() {
        System.out.println("Singleton instance created");
    }

    // static method to get the instance
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("Hello from Singleton!");
    }
}

public class SingletonDemo {
    public static void main(String[] args) {
        // get the single instance
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();

        obj1.showMessage();

        // Check if both references are same
        System.out.println("Are both objects same? " + (obj1 == obj2));
    }
}
