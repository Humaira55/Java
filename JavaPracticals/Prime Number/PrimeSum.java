/*
	problem :  take two user input as range .. and print the summation of all the
			prime number within the range...


	user input : 2
	output  : 1

*/




import java.util.Scanner;
class PrimeSum
{

	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);

	int sum=0;
	double avg=0;

	int count=0;
	
	System.out.println(" Please enter the range ");
	int fn=sc.nextInt();

	int ln=sc.nextInt();

	for(int i=fn;i<=ln;i++)     // 10 11 12 13 14 15 16 17 18 19 20 
		{
		if (isPrime(i) == 1)
			{
			sum=sum+i;
			count=count+1;
			}
		}


		//avg=(double)sum/count;
	System.out.print((double)sum/count);
	//System.out.print("summation of prime number between " + fn + " and " + ln + " is " + sum);


	}

	static int isPrime(int n)
	{
		if(n<=1)
		return 0;

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
