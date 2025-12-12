package Example;

public class Book {
	String title;
	int price;
	
	Book(String T, int P){
		title = T;
		price = P;
	}
	
	Book(){
		title = "bbb";
		price = 599;
	}
	
	void Display() {
		System.out.println("Title : "+title +", " + "Price : "+ price );
	}
	
	public static void main(String[] args) {
		Book b = new Book("aaa", 500);
		b.Display();
		
		Book b2 = new Book();
		b2.Display();
	}
	

}
