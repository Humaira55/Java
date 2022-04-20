import java.util.Scanner;
public class MultiplicationTable {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to print Table");
		int num=sc.nextInt();
		
		for(int i=1; i<=10; i++)
		{
			int table=i*num;
			System.out.println(table);
		}
	}

}
