package week5;
	public class Circle {
		int radius;

		final static double PI=3.141519;

		    public Circle(int radius) {
		        this.radius = radius;
		    }
		    
		    public double computeArea(){
		    return PI*Math.pow(radius, 2);
		    }


		}

