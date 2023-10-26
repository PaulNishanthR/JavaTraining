package Task;

import java.util.Scanner;

public class Occursubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the main string: ");
        String str1 = sc.nextLine();
        System.out.println("Enter the substring: ");
        String str2 = sc.nextLine();
        System.out.println(str1.split(str2, -1).length - 1);
    }
}
