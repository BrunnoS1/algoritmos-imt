import java.util.Scanner;

public class OrdenaBusca {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o tamanho do vetor, 0 encerra");
        int n = sc.nextInt();

        while (n > 0) {
            Retorno r = new Retorno();
            MeuVetor v1 = new MeuVetor(n);
            v1.preencheVetor();
            System.out.println("vetor gerado = " + v1);
            System.out.println("Digite o numero a buscar -1 encerra");
            double x = sc.nextDouble();
            r = v1.buscaSimples(x);
            if (r.getAchou()) {
                System.out.println("\nNumero " + x + " encontrado");
            } else {
                System.out.println("\nNumero " + x + " não encontrado");
            }
            System.out.println("Foram realizadas " + r.getContador() + " comparacoes");

            System.out.println("\nordenando...");
            v1.bubblesort();

            System.out.println("vetor ordenado = " + v1);
            r = v1.buscaBinaria(x);
            System.out.println("\nBUSCA BINARIA");

            if (r.getAchou()) {
                System.out.println("\nNumero " + x + " encontrado");
            } else {
                System.out.println("\nNumero " + x + " não encontrado");
            }
            System.out.println("Foram realizadas " + r.getContador() + " comparacoes");

            System.out.println("\nDigite o tamanho do vetor, 0 encerra");
            n = sc.nextInt();

        }
        sc.close();
    }
}
