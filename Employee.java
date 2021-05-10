package comparableComparator;

import java.util.Comparator;

public class Employee implements Comparable<Employee>{
	
	private int id;
	private String name;
	private int salary;
	
	
	public Employee(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
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
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}

	//single sorting
	@Override
	public int compareTo(Employee o) {
		//write the logic
		
		return this.salary - o.getSalary();
	}
//more sorting
	
	public static Comparator<Employee> idComp = new Comparator<Employee>() {
		@Override
		public int compare(Employee e1, Employee e2) {
			//write the logic			
			return e1.getId() - e2.getId();
		}
	};
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

}