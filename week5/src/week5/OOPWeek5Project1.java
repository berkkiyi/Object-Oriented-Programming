package week5;
	public class OOPWeek5Project1 {

    public static void main(String[] args) {
      
      
        Circle c1= new Circle(5);
        Circle c2 = new Circle(3);
        Circle c3 = new Circle(10);
        
        System.out.println(c1.computeArea());
        System.out.println(c2.computeArea());
        System.out.println(c3.computeArea());
        
        Car car1 = new Car(15, "RED", 250);
        Car car2 = new Car(25, "Green", 350);
        Car car3 = new Car(56, "Blue", 270);
        
        System.out.println(Car.counter);
        
       Car[] cars = {car1, car2, car3};
       
       for(Car c : cars){
           c.DisplayInfo();
        }
    }
    
}
