package Example;

public class rectangle {
	int length;
	int breadth;
	
	rectangle(int l , int b){
		length = l ;
		breadth = b;
	}
	
	void Area() {
		int area = length * breadth;
		System.out.println("Area = "+ area);
	}
	
	public static void main(String[] args) {
		rectangle r = new rectangle(5, 10);
		r.Area();
	}

}


//---- user input ----


//package Example;
//
//import java.util.Scanner;
//
//public class rectangle {
//    int length;
//    int breadth;
//
//    rectangle(int l, int b) {
//        length = l;
//        breadth = b;
//    }
//
//    void Area() {
//        int area = length * breadth;
//        System.out.println("Area = " + area);
//    }
//
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Enter length: ");
//        int length = sc.nextInt();
//
//        System.out.print("Enter breadth: ");
//        int breadth = sc.nextInt();
//
//        rectangle r = new rectangle(length, breadth);
//
//        System.out.println("\n--- Rectangle Details ---");
//        r.Area();
//
//        sc.close();
//    }
//}
