import java.util.Scanner;

public class Bee1259 {
    public static void main(String[] args) {
        int[] pares = new int[100000];
        int[] impares = new int[100000];
        int nPares = 0, nImpares = 0, n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            if (x % 2 == 0) {
                pares[nPares++] = x;
                System.out.println(x +" adicionado a pares");
            } else {
                impares[nImpares++] = x;
                System.out.println(x + " adicionado a impares");
            }
        }

        // ordem crescente pares
        for (int j = 1; j < nPares; j++) {
            int elemento = pares[j];
            int i;
            for (i = j - 1; i >= 0 && pares[i] > elemento; i--) {
                pares[i + 1] = pares[i];
            }
            pares[i + 1] = elemento;
        }
        // ordem decrescente impares
        for (int j = 1; j < nImpares; ++j) {
            int elemento = impares[j];
            int i;
            for (i = j - 1; i >= 0 && impares[i] < elemento; --i) {
                impares[i + 1] = impares[i];
            }
            impares[i + 1] = elemento;
        }

        //exibir
        for (int i = 0; i < nPares; i++) {
            System.out.println(pares[i]);
        }
        for (int i = 0; i < nImpares; i++) {
            System.out.println(impares[i]);
        }
        sc.close();
    }
}
