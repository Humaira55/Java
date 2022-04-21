package Assignment_4;

public class Population {

	public static void main(String[] args) {
		
		double p1 = 175000;
    	double p2 = 262500;
		
		double cal = (p2-p1)/(p1*10);
		
		double per = cal *100;
		
		System.out.println("The Average increase in population is : " + per + " %");

	}

}

//Output:
//The Average increase in population is : 5.0 %