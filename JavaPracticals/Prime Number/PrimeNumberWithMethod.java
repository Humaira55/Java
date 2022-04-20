import java.util.*;
class PrimeNumberWithMethod
{
	public static void main(String[] args)
	{
	System.out.println("Enter a number to check prime or not .. " );
	Scanner sc=new Scanner(System.in);

	int num=sc.nextInt();

	System.out.println(checkPrime(num));

	}

	static boolean checkPrime(int n)
	{
	if(n<=1) 
	{
	return false;
	}

	for(int i=2;i<=n-1;i++)
		{
		if(n%i == 0) 
			{
			return false;
			}
		}

	return true; 
	}
}