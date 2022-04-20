/*

*****
*   *
*   *
*   *
*****


*/

class SquarePattern
{
	public static void main(String[] args)
	{
	
	java.util.Scanner sc=new java.util.Scanner(System.in);
	System.out.println(" Enter the total number of line ... " );
	
	int n=sc.nextInt();

	for(int i=1;i<=n;i++)	// outer loop
		{
		for(int j=1;j<=n;j++)	// inner loop
			{
				if(i==1 || i==n || j==1 || j==n)
				{
				System.out.print("*");
				}
				else
				{
				System.out.print(" ");
				}
			}
		System.out.println();
		}
	}
}