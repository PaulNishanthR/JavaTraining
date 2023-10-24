package D_Override;

public class Vehicle {
    public Vehicle() {
        System.out.println("Called");
    }

    public Vehicle(int a) {
        System.out.println("constuctor"+a);
    }

    protected int wheels=4;
    void getColor(){
        System.out.println("Green");
    }
    void getWheels(){
        System.out.println("Wheels-"+wheels);
    }

    void getQuantity(){
        System.out.println("45");
    }
}
