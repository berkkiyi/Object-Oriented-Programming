package week10_Interface;

public class Main {

	public static void main(String[] args) {
		FullTimeEmployee fEmployee = new FullTimeEmployee("Zulal", 9500);
        PartTimeEmployee pEmployee = new PartTimeEmployee("Abullah", 1200);

        Employee[] workers = {fEmployee, pEmployee};

        for(Employee e : workers) {
            System.out.println(e.calculateSalary());
        }
	}

}
