package Example;

public class labb {
    
    static class OverloadExample {

        // Constructor Overloading
        OverloadExample() {
            System.out.println("Default Constructor Called");
        }

        OverloadExample(int x) {
            System.out.println("Constructor with 1 parameter: " + x);
        }

        OverloadExample(int x, int y) {
            System.out.println("Constructor with 2 parameters: " + x + ", " + y);
        }

        // Method Overloading
        void display(int a) {
            System.out.println("Display method with 1 parameter: " + a);
        }

        void display(int a, int b) {
            System.out.println("Display method with 2 parameters: " + a + ", " + b);
        }

        void display(String msg) {
            System.out.println("Display method with string parameter: " + msg);
        }

        public static void main(String[] args) {

            OverloadExample obj1 = new OverloadExample();
            OverloadExample obj2 = new OverloadExample(10);
            OverloadExample obj3 = new OverloadExample(10, 20);

            System.out.println();

            obj1.display(5);
            obj2.display(5, 10);
            obj1.display("Hello Java Overloading!");
        }
    }
}
