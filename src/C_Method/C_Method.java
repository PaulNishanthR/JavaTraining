package C_Method;

public class C_Method {
//    void method(){
//        System.out.println("This is method");
//    }
//    static int add(){
//        return 7+9;
//    }
//    void method(String msg){
//        System.out.println(msg);
//    }

    public static void main(String[] args) {
        C_Method1 object = new C_Method1();
        object.method();
        object.method("Overloading");
        int sum = C_Method1.add();
        System.out.println("The sum is " + sum);
    }
}

class C_Method1 {
    void method() {
        System.out.println("This is method");
    }

    static int add() {
        return 7 + 9;
    }

    void method(String msg) {
        System.out.println(msg);
    }

}
