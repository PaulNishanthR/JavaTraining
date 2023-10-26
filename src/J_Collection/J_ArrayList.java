package J_Collection;

import java.util.ArrayList;
import java.util.LinkedList;

public class J_ArrayList {
    public static void main(String[] args) {
        ArrayList<Student> arrayList = new ArrayList<>();
        arrayList.add(new Student(1, "nishanth"));
        arrayList.add(new Student(2, "arul"));
        //using constructor
        Student std = new Student(3, "Sowmya");
        arrayList.add(std);
        //using setter
        Student stdSetter =new Student();
        stdSetter.setName("Setter");
        stdSetter.setRollNo(4);
        arrayList.add(stdSetter);
        arrayList.add(new Student(1, "Arul"));
        //to update item in the list of index 1
        arrayList.set(1, new Student(1, "updating"));

        System.out.println("------Before removing-----");
        for (Student student : arrayList) {
            System.out.println(student.getName());
        }
        //to remove an object
        arrayList.remove(1);
        System.out.println("---After removing----");
        for (Student student : arrayList) {
            System.out.println(student.getName());
        }
        LinkedList<Student> linkedList=new LinkedList<>();
        linkedList.add(0,new Student(1,"Abcd"));
        System.out.println("----LinkedList----");
        for (Student student:linkedList) {
            System.out.println(student.getName());
        }
    }
}
