package SuperKeyword;

import java.util.Scanner;

class RedMi {
	
	double display;
	int ram;
	String processor;
	
	RedMi()
	{
		System.out.println("Redmi Constructor .. ");
	}
	
	 RedMi(double display, int ram, String processor) {
		super();
		this.display = display;
		this.ram = ram;
		this.processor = processor;
	}

	 void m1()
	 {
		 System.out.println("m1 method inside redmi ");
	 }

	void redmiProperties()
	{
		System.out.println("Display : "+ display + " ram : "+ ram + " Processor : "+ processor);
	}

}


class Note5Pro extends RedMi {
	 
	 static String modelName="Note5Pro";

	 Note5Pro(double display, int ram, String processor) 
	 {
		super(display, ram, processor);
	 } 
	 
	 void note5ProProperties()
		{
			super.redmiProperties();
			System.out.println("Model name is :"+ modelName);
		}
	 
}

class Note7ProPlus extends RedMi {

	 String modelName;

	 Note7ProPlus(double display, int ram, String processor,String modelName) 
	 {
		super(display, ram, processor);
		this.modelName = modelName;
		
	 } 
	 
	 @Override
	 void m1() 					// override
	 {
		 super.m1();
		 System.out.println("m1 inside Note7ProPlus");
	 }
	 
	 
	 void note5ProProperties()
		{
			super.redmiProperties();
			System.out.println("Model name is :"+ modelName);
		}
	 


}




public class HierarchicalSuper {

	public static void main(String[] args) {
		
		System.out.println(" ----- For Note5Pro ----- ");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the ram ");
		int ram1=sc.nextInt();
		
		sc.nextLine();
	
		System.out.println("Enter the processor ");
		String pro1=sc.nextLine();
		
		System.out.println("Enter the display ");
		double dis1=sc.nextDouble();
		
		Note5Pro np=new Note5Pro(dis1, ram1, pro1);
		
		
		
		System.out.println(" ----- For Note7ProPlus ----- ");
		
		
		
		System.out.println("Enter the ram ");
		int ram2=sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("Enter the processor ");
		String pro2=sc.nextLine();
		
		System.out.println("Enter the display ");
		double dis2=sc.nextDouble();
		
		sc.nextLine();
		
		System.out.println("Enter the model name ");
		String mname=sc.nextLine();
		
		
		Note7ProPlus npp= new Note7ProPlus(dis2, ram2, pro2, mname);
		
		System.out.println("------ n5p object ------");
		np.note5ProProperties();
		
		System.out.println("------ n7pp object ------");
		npp.note5ProProperties();
		
		npp.m1();
			

		}

}
