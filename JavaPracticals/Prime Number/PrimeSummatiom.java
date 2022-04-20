import java.util.Scanner;

public class PrimeSummatiom {
	static int PrimeChk(int n) {
		for(int i=2; i<=n-1; i++) {
			if (n%i==0){
				return 0;
			}
		}
		return 1;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum=0;
		double avg=1;
		int count=0;
		System.out.println("Enetr the Range");
		int ll=sc.nextInt();
		int ul=sc.nextInt();
		for(int i=ll; i<=ul; i++) {
			if (PrimeChk(i)==1) {
				sum=sum+i;
				count++;
			}		
		}
		avg=(double)sum/count;
		System.out.println("Average of Prime no. is : " +avg);

	}

}
