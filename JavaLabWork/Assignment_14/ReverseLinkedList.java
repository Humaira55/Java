package Assignment_14;

import java.util.LinkedList;

public class ReverseLinkedList {
	
	static LinkedList<Integer> reverse(LinkedList<Integer> ll)
	{
		for(int i=ll.size()-1; i>=0; i--)
		{
			System.out.print(ll.get(i) + " ");
		}
		
		return ll;
	}

	public static void main(String[] args) {
		
		LinkedList<Integer> ll = new LinkedList<Integer>();
		
		ll.addFirst(12);
		ll.addLast(50);
		
		System.out.println("BEFORE REVERSING : ");
		System.out.println(ll);
		System.out.println();
		
		System.out.println("AFTER REVERSING");
		reverse(ll);
	}

}
