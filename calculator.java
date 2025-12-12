//program to implement function overloading and constructor overloading 
//- create a class calculator with attribute a and b , write two constructor of 
//it calculator(default) and calculator(parameter). write two 
//functions add(int , int), and add(int,int,int). create two objects for both
//the constructors and use the overloaded methods
//



package Example;

public class cal {
    int a;
    int b;
    
    // Default constructor
    cal() {
        this.a = 5;  
        this.b = 6;
    }

    // Parameterized constructor
    cal(int a1, int b1) {
        this.a = a1;
        this.b = b1;
    }

    // Overloaded method 1
    public int Add(int a, int b) {
        return a + b;
    }

    // Overloaded method 2
    public int Add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {

        cal obj = new cal(1, 2);   // parameterized constructor
        cal c2 = new cal();        // default constructor

        System.out.println(obj.Add(2, 5));      // works
        System.out.println(obj.Add(5, 8, 9));   // works

        // Using constructor values stored in c2 (5 and 6)
        System.out.println(c2.Add(c2.a, c2.b));  
    }
}
