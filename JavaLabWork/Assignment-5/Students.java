package Assignment_5;

import java.util.Scanner;

public class Students {

	public static void main(String[] args) {
		
		double below = 48;
		
		double above = below * 1/4;
		
		double totalOf80Per = below + above;
		
		double totalNoOfStudents = (totalOf80Per/80)*100;
		
		System.out.println("The total No. of Students are : " + totalNoOfStudents);
	}

}

//Output :
//	The total No. of Students are : 75.0