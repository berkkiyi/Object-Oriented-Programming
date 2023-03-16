package week4;

public class main {

	public static void main(String[] args) {
		try {
			week4exception time = new week4exception(24,65,56);
			System.out.println(time.trueTime());
			}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("done");
		}
	}

}
