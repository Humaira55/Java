class PrimeWithMethodInt
{
	public static void main(String[] args)
	{
	java.util.Scanner sc=new java.util.Scanner(System.in);

	System.out.println("Enter the number to be checked ..");
	int n=sc.nextInt();

	if(checkPrime(n)==1)
	{	
	System.out.println(n + " is a prime number ..!");
	}

	else
	{
	System.out.println(n + " is not a prime number ..!");
	}	
	}

	static int checkPrime(int n)	
	{
		
		if(n<=1)
		{
		return 0;
		}

		for(int i=2;i<=n-1;i++)
		{
			if(n%i==0)
			{
			return 0;
			}
		}

		return 1;		

		}
	}