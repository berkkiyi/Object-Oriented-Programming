package week5;


public class Car {
    private int id;
    private  String color;
    private int maxSpeed;
    public final static String brand="SKODA";
    static int counter=0;

    public Car(int id, String color, int maxSpeed) {
        this.id = id;
        this.color = color;
        this.maxSpeed = maxSpeed;
        counter++;
    }
    
    public void DisplayInfo(){
        System.out.println(this.id +" " + this.color+" "+this.maxSpeed +" "+ this.brand);
    }
 

}
