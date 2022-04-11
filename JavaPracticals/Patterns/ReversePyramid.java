import java.util.Scanner;

public class ReversePyramid {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of Lines :");
		int number = sc.nextInt();
		for(int i=number; i>=1; i--)
		{
			for(int j=i; j>=1; j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
