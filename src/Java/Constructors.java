package Java;

public class Constructors {
    
    // Constructor executes a block of code whenever an object is created
    // Constructors will not return any values
    // Constructor name should be class name

    // Default Constructor
    public Constructors() {
        System.out.println("I am in Default Constructor");
    }
    
    // Parameterized Constructors
    public Constructors(int a, int b) {
        System.out.println("I am in Parameterized Constructor");
        int sum = a + b;
        System.out.println("Sum: " + sum);
    }

    public Constructors(String message) {
        System.out.println(message);
    }
    
    public static void main(String[] args) {
        // Whenever we create an object, the constructor is called
        @SuppressWarnings("unused")
		Constructors DefaultConstructor = new Constructors();
        @SuppressWarnings("unused")
		Constructors ParameterizedConstructor = new Constructors(4, 5);
        @SuppressWarnings("unused")
		Constructors StringConstructor = new Constructors("Hello");
    }
}
