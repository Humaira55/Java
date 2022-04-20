class PrimeNumber
{
	public static void main(String[] args)
	{
	java.util.Scanner sc=new java.util.Scanner(System.in);

	int count =0;
	
	System.out.println("Enter the number to be checked .. ");
	int prime_check = sc.nextInt();

	for(int i=2;i<=prime_check-1;i++)
		{
		if(prime_check % i==0)
			{
			count = count +1;
			}
		}

	if(count == 0)
		{
		System.out.println(prime_check + " is a prime number .. !");
		}
	else
		{
		System.out.println(prime_check + " is not a prime number .. !");
		}
	}
}	
			