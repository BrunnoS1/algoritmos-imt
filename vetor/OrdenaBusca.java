import java.util.Scanner;

public class OrdenaBusca {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Retorno r = new Retorno();
        MeuVetor v1 = new MeuVetor(10);
        v1.preencheVetor();
        System.out.println("vetor = " + v1);
        System.out.println("Digite o numero a buscar -1 encerra");
        double x = sc.nextDouble();
        while (x != -1) {
            r = v1.buscaSimples(x);
            if (r.getAchou()) {
                System.out.println("\nNumero " + x + " encontrado no vetor com " + r.getContador() + " comparacoes");
            } else {
                System.out.println("\nNumero " + x + " não encontrado no vetor em " + r.getContador() + " comparacoes");
            }
            System.out.println("\nDigite o numero a buscar -1 encerra");
            x = sc.nextDouble();
        }
        sc.close();
    }
}
