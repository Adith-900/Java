package Example;

 class Stud{
	
	private String name;
	private int age;
	
	public void setData() {
		name = "Johnn";
		age = 20;
		
	}
	public void Display() {
		System.out.println("Name : "+ name + " Age : "+ age);
	}
}
public class Student{
	
	public static void main (String[] agrs) {
		Stud s = new Stud();
		
		s.setData();
		s.Display();
	}
	
	
	
}

//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//---User input----


//package Example;
//
//public class Student {
//	String name;
//	int age;
//	
//	Student(String n, int a){
//		name = n;
//		age = a;
//	}
//	
//	void getDetails() {
//		System.out.println("Name : "+ name);
//		System.out.println("Age : " + age);
//	}
//	
//	public static void main(String[] args) {
//		Student s = new Student("john",22);
//		s.getDetails();
//	}
//	
//	
//
//}
//
////----user input---
//
//
//
////package Example;
////
////import java.util.Scanner;
////
////public class Student {
////    String name;
////    int age;
////
////    Student(String n, int a) {
////        name = n;
////        age = a;
////    }
////
////    void getDetails() {
////        System.out.println("Name : " + name);
////        System.out.println("Age : " + age);
////    }
////
////    public static void main(String[] args) {
////
////        Scanner sc = new Scanner(System.in);
////
////        System.out.print("Enter Name: ");
////        String name = sc.nextLine();
////
////        System.out.print("Enter Age: ");
////        int age = sc.nextInt();
////
////        Student s = new Student(name, age);
////
////        System.out.println("\n--- Student Details ---");
////        s.getDetails();
////
////        sc.close();
////    }
////}


//-----------------------------------------------------------------------------------------------------------------------------------
