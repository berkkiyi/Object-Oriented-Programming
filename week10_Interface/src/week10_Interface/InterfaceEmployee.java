package week10_Interface;

public class InterfaceEmployee {
	interface Salary {
	    double calculateSalary();
	}

	abstract class Employee implements Salary{
	    String name;
	    double wage;

	    public Employee(String name, double wage) {
	        this.name= name;
	        this.wage= wage;
	    }
	}

	class FullTimeEmployee extends Employee {
	    public FullTimeEmployee(String name, double wage) {
	        super(name, wage);
	    }

	    @Override
	    public double calculateSalary() {
	        return wage;
	    }
	}

	class PartTimeEmployee extends Employee {
	    int hours;

	    public PartTimeEmployee(String name, double wage) {
	        super(name, wage);
	    }

	    @Override
	    public double calculateSalary() {
	        return wage*hours;
	    }
	}
	public class Main {

		public static void main(String[] args) {
			FullTimeEmployee fEmployee = new FullTimeEmployee("Zulal", 9500);
	        PartTimeEmployee pEmployee = new PartTimeEmployee("Abullah", 1200);

	        Employee[] workers = {fEmployee, pEmployee};

	        for(Employee e : workers) {
	            System.out.println(e.calculateSalary());
	        }
}
