package Task;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        int len = str.length();
        int flag = 0;
        for (int i = 0; i < len; i++) {
            if (str.charAt(i) != str.charAt(len - i -1)) {
                flag = 1;
            }
        }
        if (flag == 1) {
            System.out.println(str + " is not a palindrome");
        } else {
            System.out.println(str + " is a palindrome");
        }
    }
}
