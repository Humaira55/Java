package Assignment_4;

class variable{
	int a = 30;
	int b= 20;
}

class addition extends variable{
	int add=0;
	void add()
	{
		add = a+b;
		System.out.println("Addition of nember is : "+ add);
	}	
}

class average extends addition{
	void avg()
	{
		int avg = add/2;
		System.out.println("Average of Number is :" + avg);
	}	
}

class subtraction extends variable{
	void sub()
	{
		int sub = a-b;
		System.out.println("Subtraction of nember is : "+ sub);
	}
}

class multiplication extends variable{
	void mul()
	{
		int mul = a*b;
		System.out.println("Multiplication of nember is : "+ mul);
	}
}

public class Multilevel_Hierar {

	public static void main(String[] args) {
		average a1 = new average();
		subtraction a2 = new subtraction();
		multiplication a3 = new multiplication();
		average a4 = new average();
		a1.add();
		a4.avg();
		a2.sub();
		a3.mul();

	}

}

//Output:
//Addition of nember is : 50
//Average of Number is :0
//Subtraction of nember is : 10
//Multiplication of nember is : 600

