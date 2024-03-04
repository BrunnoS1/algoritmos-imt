import java.util.Scanner;

public class Ordenacao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MeuVetor v1;
        int tamanho;
        System.out.print("Digite o tamanho do vetor, 0 encerra: ");
        tamanho = sc.nextInt();
        while (tamanho > 0) {
            v1 = new MeuVetor(tamanho);
            v1.preencheVetor();
            System.out.println("vetor gerado :\n" + v1);
            v1.bubblesort();
            System.out.println("vetor ordenado :\n" + v1);

            System.out.print("Digite o tamanho do novo vetor, 0 encerra: ");
            tamanho = sc.nextInt();
        }
        sc.close();
    }
}
