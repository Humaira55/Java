class PrimeWithMethodIntRange
{
	public static void main(String[] args)
	{
	int big,small;
	
	java.util.Scanner sc=new java.util.Scanner(System.in);

	System.out.println("Enter the lower limit..");
	int ll=sc.nextInt();
	
	System.out.println("Enter the upper limit..");
	int ul=sc.nextInt();

	if(ul>ll)
	{
	big=ul;
	small=ll;
	}

	else
	{
	big=ll;
	small=ul;
	}

	for(int i=small;i<=big;i++)
	{
		if(checkPrime(i) == 1)
		{
		System.out.print( i + " ");
		}
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