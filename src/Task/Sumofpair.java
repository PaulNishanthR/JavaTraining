package Task;

public class Sumofpair {
    //    int n,k=15;
//    int arr1[]={-5, 1, -40, 20, 6, 8, 7};
//    for(int i=0;i<=arr1[])
    public static void main(String[] args) {
        int n, k = 15;
        int arr1[] = {-5, 1, -40, 2, 6, 8};

        for (int i = 0; i < arr1.length; i++) {
            for (int j = i + 1; j < arr1.length; j++) {
                if (arr1[i] + arr1[j] == k) {
                    System.out.println("true");
                    return;
                }
            }
        }
        System.out.println("false");

    }
}
