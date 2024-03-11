import java.util.Scanner;

public class TesteRemove {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MeuVetor v1 = new MeuVetor(10000);
        v1.preencheVetor();
        System.out.println(v1);

        System.out.println("Digite o numero a remover: ");
        double x = sc.nextDouble();

        if(v1.removeBool(x)) {
            System.out.println("Numero " + x + " removido");
        } else {
            System.out.println("Numero nao encontrado");
        }

        // int removido = v1.removeAll(x);
        // System.out.println(v1 + "\nForam removidos " + removido + " itens");

        // System.out.println("ordenando...");
        // v1.insertionSort();
        // if (v1.removeOrdenado(x)) {
        //     System.out.println("Numero " + x + " removido");
        // } else {
        //     System.out.println("Numero nao encontrado");
        // }

        sc.close();
    }
}
