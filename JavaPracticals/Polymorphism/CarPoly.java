package Poymorphism;

import java.util.Scanner;

abstract class Car{
	
	abstract void start();
	abstract void run();
	abstract void stop();
	
}

class TataSumo extends Car{
	
	String carName = "Tata Sumo";
	void start() {
		System.out.println(carName + " Car is Starting.. ");
	}
	void run() {
		System.out.println(carName + " Car is Running.. ");
	}
	void stop() {
		System.out.println(carName + " Car is Stopped.. ");
	}
}

class Scorpio extends Car{
	String carName = "Scorpio";
	void start() {
		System.out.println(carName + " Car is Starting.. ");
	}
	void run() {
		System.out.println(carName + " Car is Running.. ");
	}
	void stop() {
		System.out.println(carName + " Car is Stopped.. ");
	}
}

public class CarPoly {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the car name :  ");
		String carName = sc.nextLine();
		
		Car c1 = new TataSumo();
		Car c2 = new Scorpio();
		if(carName.equals("Tata Sumo"))
		{
			c1.start();
			c1.run();
			c1.stop();
		}
		else if(carName.equals("Scorpio")) {
			c2.start();
			c2.run();
			c2.stop();
		}
		else {
			System.out.println("This Car is not Available");
		}
	}

}
