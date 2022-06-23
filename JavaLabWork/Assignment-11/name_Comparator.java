package Assignment_11;

import java.util.Comparator;

public class name_Comparator implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		return o1.name.compareToIgnoreCase(o2.name);
		
	}

}
