class Vehicle{
    protected String brand;
    protected int speed;

    public Vehicle(String brand, int speed){
        this.brand = brand;
        this.speed = speed;
    }

    public void move(){
        System.out.println("The "+brand+" vehicle moves at the speed of "+speed+" mph.");
    }
}

class Car extends Vehicle{
    private int doors;
    public Car(String brand, int speed, int doors){
        super(brand, speed);
        this.doors = doors;
    }

    @Override
    public void move(){
        System.out.println("The "+doors+"-door "+brand+" vehicle is moving at the speed of "+speed+" mph.");
    }
}

class Drone extends Vehicle{
    private int maxAltitude;
    public Drone(String brand, int speed, int maxAltitude){
        super(brand,speed);
        this.maxAltitude = maxAltitude;
    }
    @Override
    public void move(){
        System.out.println("The "+brand+" drone flies at an altitude of "+maxAltitude+" feet at "+speed+" mph.");
    }
}

public class FleetManager {
    public static void main(String[] args){
        System.out.println("Deploying Fleet via Array...");
        Vehicle[] myFleet = new Vehicle[3];
        myFleet[0] = new Vehicle("Generic", 40);
        myFleet[1] = new Car("Tesla", 100, 2);
        myFleet[2] = new Drone("DJI", 20, 150);

        for(int i = 0; i<myFleet.length; i++){
            myFleet[i].move();
        }
    }
}
