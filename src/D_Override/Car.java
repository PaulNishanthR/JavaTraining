package D_Override;

public class Car extends Vehicle {
    void getColor() {
        System.out.println("Child - Red");
    }
    void getSample(){
        System.out.println("Child "+wheels);
    }
}
