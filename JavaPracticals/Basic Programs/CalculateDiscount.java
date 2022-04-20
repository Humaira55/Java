//Program to Calculate Discount on Product

import java.util.Scanner;
public class CalculateDiscount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr Market Price of product");
		int a = sc.nextInt();
		System.out.println("Enetr the discount on product (%)");
		int b = sc.nextInt();
		
		int per = a*b/100;
		int discount = a-per;
		
		System.out.println("The discount on product is : " + discount);
		

	}

}
