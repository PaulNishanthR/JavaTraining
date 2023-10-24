package A_Object;

public class A_Object {
    String firstName = "Nishanth";
    int age = 21;
    static String lastname = "aaa";


    public static void main(String[] args) {
        A_Object object = new A_Object();
        System.out.println(object);
        System.out.println(object.firstName);
        System.out.println(object.age);
        System.out.println(lastname);

        A_Object objectTwo = new A_Object();
        System.out.println(objectTwo);
        System.out.println(objectTwo.firstName);
    }
}


