package E_Interface;

public class Car implements I_Vehicle {
    void drive() {
        System.out.println("Drive");
    }

    public void stop() {
        System.out.println("Stop");
    }
    public void alarm(){
        System.out.println("Alarming");
    }
}
