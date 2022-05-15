package Assignment_7;

import java.util.Scanner;

public class Engine {
	
	String typeOfEngine;
	int hp;
	
	Engine(String typeOfEngine, int hp)
	{
		this.typeOfEngine = typeOfEngine;
		this.hp = hp;
		System.out.println("The Bike Name is : " + this.typeOfEngine + " and Hourse Power is : " + this.hp);
	}
	
	void EngineStart()
	{
		System.out.println("Engine is Starting to start the " + typeOfEngine);
	}
	
	void EngineStop()
	{
		System.out.println("Engine is Stoping to stop the " + typeOfEngine);
	}

}
