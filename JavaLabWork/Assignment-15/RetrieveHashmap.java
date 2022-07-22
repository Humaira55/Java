//Retrieve a key associated with a given key from the HashMap

package Assignment_15;

import java.util.HashMap;
import java.util.Scanner;

public class RetrieveHashmap {

	public static void main(String[] args) {
		
		HashMap<Integer,String> map = new HashMap<Integer,String>();
		
		map.put(1, "India");
		map.put(2, "China");
		map.put(3, "Canada");
		map.put(4, "Pakistan");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a key : ");
		int key = sc.nextInt();
		
		if(map.containsKey(key))
		{
			System.out.println(map.get(key));
		}
		else {
			System.out.println("Data not Available");
		}

	}

}
