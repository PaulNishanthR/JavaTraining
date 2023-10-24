package D_Override;

public class D_Override {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle(1);
        vehicle.getWheels();
        vehicle.getColor();

        Car car = new Car();
        car.getWheels();
        car.getColor();
        car.getQuantity();
        car.getSample();

        float numFloat = 10.7f;
        int numInt = (int) numFloat;
        System.out.println(numInt);
    }

}
