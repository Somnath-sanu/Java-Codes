package Arrays;

public class knowDataType {
    public static void main(String[] args) {
        // Example variables
        Object a = 42;          // an int
        // Object a = 3.14f;     // a float
        // Object a = "Hello";   // a String

        // Check the type of the variable
        if (a instanceof Integer) {
            System.out.println("Variable 'a' is an int.");
        } else if (a instanceof Float) {
            System.out.println("Variable 'a' is a float.");
        } else if (a instanceof String) {
            System.out.println("Variable 'a' is a String.");
        } else {
            System.out.println("Variable 'a' is of an unknown type.");
        }
    }
}
