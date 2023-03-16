package week3;

public class Main {

	public static void main(String[] args) {
		try {
			
			Worker worker1 = new Worker("Berk",15000);
			Worker worker2 = new Worker("bedo",15000);
			System.out.println(worker1.getSalary());
			Worker worker3 = new Worker("Berk",-15000);
			
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println(Worker.counter);
		}
	}

}
