import java.util.Scanner;

public class B1162 {
    static int bubbleSort(int[] trem) {
        int swaps = 0;
        for (int i = 1; i < trem.length; i++) {
            for (int j = 0; j < trem.length - i; j++) {
                if (trem[j] > trem[j + 1]) {
                    int temp = trem[j];
                    trem[j] = trem[j + 1];
                    trem[j + 1] = temp;
                    swaps++;
                }
            }
        }
        return swaps;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int L = sc.nextInt();
            int[] trem = new int[L];
            for (int j = 0; j < L; j++) {
                trem[j] = sc.nextInt();
            }
            int swaps = bubbleSort(trem);
            System.out.println("Optimal train swapping takes " + swaps + " swaps.");
        }
        sc.close();
    }
}