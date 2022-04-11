
public class Method3 {
	
	static void calculation(double r) {
		double pi=3.14;
		double radius = r;
		double area = pi*r*r;
		System.out.println("Area of Circle is : " +area);
	}
	
	static void calculation(int l, int b) {
		int length = l;
		int breadth = b;
		int area = l*b;
		System.out.println("Area of Rectangle is : " +area);
	}
	
	static void calculation(int s) {
		int side = s;
		int area = s*s;
		System.out.println("Area of Box is : " + area);
	}

	public static void main(String[] args) {

		Method3.calculation(5.0);
		Method3.calculation(10,8);
		Method3.calculation(4);
	}
}
