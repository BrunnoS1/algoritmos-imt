import java.util.Date;
import java.util.Scanner;
     
public class ComparaMetodos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("escolha o tamanho do vetor, 0 encerra: ");
        int tamanho = scanner.nextInt();
        while (tamanho > 0) {
            MeuVetor v = new MeuVetor(tamanho);
            v.preencheVetor(tamanho*10);
            // System.out.println(v);
            long inicio = new Date().getTime();
            v.quicksort(0, tamanho-1);
            long fim = new Date().getTime();
            // System.out.println(v);
            System.out.println("Tempo para ordenar = " + (fim - inicio) + "ms");
            System.out.print("escolha o tamanho do vetor, 0 encerra: ");
            tamanho = scanner.nextInt();
        }
        scanner.close();
    }
}
