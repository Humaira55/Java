import java.util.Scanner;

public class Pyramid1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of Lines :");
		int number = sc.nextInt();
		for(int i=1; i<=number; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print(i);
			}
			System.out.println("");
		}

	}

}
