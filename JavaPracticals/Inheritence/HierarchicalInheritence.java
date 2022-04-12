class parent
{
	int a = 100;
	int b = 80;
}

class child1 extends parent
{
	void add()
	{
		int add = a+b;
		System.out.println("Addition : "+ add);
	}
}

class child2 extends parent
{
	void sub()
	{
		int sub = a-b;
		System.out.println("Subtraction : "+ sub);
	}
}
public class HierarchicalInheritence {

	public static void main(String[] args) {
		child1 c1 = new child1();
		child2 c2 = new child2();
		c1.add();
		c2.sub();

	}

}
