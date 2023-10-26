package Task;

import java.util.Scanner;

public class Removevowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String str1 = "";
        str1 = str.replaceAll("[aeiou]", "");
        System.out.println("String after removing vowel : " + str1);
    }

}

