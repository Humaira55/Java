
public class StaticData {

		int id;
		String name;
		static String location="Mumbai";
		static String compName = "SPND";
		
		StaticData(int i, String n)
		{
			id = i;
			name = n;
		}
		
		void display()
		{
			System.out.println(id + " " +name +" "+location + " " +compName);
		}
	public static void main(String[] args) {
		StaticData c1 = new StaticData(1, "Iram");
		StaticData c2 = new StaticData(2, "Anam");
		c1.display();
		c2.display();
	}

}
