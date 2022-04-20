package Inheritence;

class Book{
	void disp1()
	{
		System.out.println("This is Liabrary of Books..");
		System.out.println("");
	}
}

class BookTypes extends Book{
	String b1 = "Educational Book";
	String b2 = "Novels";
	String b3 = "Biography";
	void disp2()
	{
		System.out.println("The Types of Books are : ");
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println("");
	}
}

class Biography extends BookTypes{
	String b1 = "Red Joan";
	String b2 = "Women Talking";
	void disp3()
	{
		System.out.println("The Biography Books are : ");
		System.out.println(b1);
		System.out.println(b2);
		System.out.println("");
	}
}

public class MultilevelMain {

	public static void main(String[] args) {
		Biography p1 = new Biography();
		p1.disp1();
		p1.disp2();
		p1.disp3();

	}

}
