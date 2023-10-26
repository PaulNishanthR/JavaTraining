package Task;

import java.util.Scanner;

public class Occurofchar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        System.out.println("Enter the character to be count: ");
        char ch = sc.next().charAt(0);
        int c = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch)
                c++;
        }
        System.out.println("Occurrence of " + ch + " is " + c);
    }

}
