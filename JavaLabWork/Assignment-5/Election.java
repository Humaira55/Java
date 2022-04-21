package Assignment_4;

public class Election {
	
	static double c1 = 1136;
	static double c2 = 7636;
	static double c3 = 11628;


	public static void main(String[] args) {

		
		double sum = c1+c2+c3;
		
		double div = c3/sum ;
		
		double per = div * 100;
		
		System.out.println("The Percentage of winning candidate is : " + per);

	}

}
