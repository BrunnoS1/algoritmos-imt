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

            //copiar v em v2
            // MeuVetor v2 = new MeuVetor(tamanho);
            // for (int i = 0; i < tamanho; i++) {
            //     v2.adiciona(v.getV()[i]);
            // }

            long inicio = new Date().getTime();
            v.quicksort(0, tamanho-1);
            long fim = new Date().getTime();
            System.out.println("Tempo para ordenar quicksort = " + (fim - inicio) + "ms");

            inicio = new Date().getTime();
            v.quicksort(0, tamanho-1);
            fim = new Date().getTime();
            System.out.println("Segundo quicksort demorou = " + (fim - inicio) + "ms");

            // v.resetVetor();
            // v.preencheVetor(tamanho*10);

            // inicio = new Date().getTime();
            // // v.bubbleSort();
            // v2.bubbleSort();
            // fim = new Date().getTime();
            // System.out.println("Tempo para ordenar bubblesort = " + (fim - inicio) + "ms");
            
            System.out.print("escolha o tamanho do vetor, 0 encerra: ");
            tamanho = scanner.nextInt();
        }
        scanner.close();
    }
}
