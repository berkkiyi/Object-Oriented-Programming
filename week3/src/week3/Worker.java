package week3;

public class Worker {
	private String name;
	private int salary;
	public static int counter;
	public Worker(String name,int salary) {
		setName(name);
		setSalary(salary);
		counter++;
	}
	
	public void setSalary(int salary) {
		if(salary<0) {
			throw new IllegalArgumentException("salary amount must be greater than zero");
		}
		this.salary=salary;
	}
	public void setName(String name) {
		this.name=name;
	}
	
	public int getSalary() {
		return salary;
	}
	
	public String getName() {
		return name;
	}
}
