package Assignment_14;

import java.util.Objects;

public class Employee {
	
	private int id;
	private String name;
	private String dept;
	
	public Employee(int id, String name, String dept) {
		this.setId(id);
		this.setName(name);
		this.setDept(dept);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Employee [Id=" + getId() + ", Name=" + getName() + ", Department=" + getDept() + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(dept, name);
	}

	@Override
	public boolean equals(Object obj) {
		Employee other = (Employee) obj;
		return Objects.equals(dept, other.dept) && Objects.equals(name, other.name);
	}
	
	

}
