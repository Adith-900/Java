package Example;
import java.util.Scanner;

public class pro1 {
	public void Sum() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter value of x : ");
		int x = sc.nextInt();
		System.out.print("Enter value of y : ");
		int y = sc.nextInt();
		int sum = x + y;
		System.out.println("Sum = " + sum);
		
		
	}	
	public static void main(String[] args) {
		
		pro1 p = new pro1();
		p.Sum();
		
	
	}
}
