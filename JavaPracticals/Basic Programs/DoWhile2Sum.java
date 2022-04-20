class DoWhile2Sum
{
	

	public static void main(String[] spnd)
	{

	java.util.Scanner sc=new java.util.Scanner(System.in);

	System.out.println(" Give the range ");
	int start=sc.nextInt();
	int last=sc.nextInt();
	
	int sum=0; 

	do
	{

	sum=sum+start;
	start++;

	}
	
	while(start<=last);

	System.out.println(sum);

	}
}
