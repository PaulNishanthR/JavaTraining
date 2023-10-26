package Task;

import java.util.Scanner;

public class Subset {
    public static void main(String args[]) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first array size: ");

        int n = sc.nextInt();
        int[] arr1 = new int[10];
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter second array size: ");

        int m = sc.nextInt();

        int[] arr2 = new int[3];
        for (int j = 0; j < m; j++) {
            arr2[j] = sc.nextInt();
        }
        int f = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr1[i] == arr2[j]) {
                    f++;
                    break;
                }
            }
        }
        if (m == f)
            System.out.println("true");
        else
            System.out.println("false");
    }

}
