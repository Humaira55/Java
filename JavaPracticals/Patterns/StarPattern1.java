//import java.util.*;


class StarPattern1
{
	public static void main(String args[])
	{
	java.util.Scanner sc=new java.util.Scanner(System.in);

	//Scanner sc=new Scanner(System.in);
	System.out.println("Enter the total number of line ..");

	int n = sc.nextInt();

	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=i;j++)
		{
		System.out.print("*");
		}
	System.out.println();
	}

	}
}
