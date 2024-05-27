import java.util.Random;

public class TesteABB {
    public static void main(String[] args) {
        Random r = new Random();
        ABB abb = new ABB();
        int t = r.nextInt(200) + 50;
        // int t = 13;
        System.out.println("t = " + t);
        System.out.println("numeros gerados");
        for (int i = 0; i < t; i++) {
            int num = r.nextInt(t);
            System.out.print(num + " ");
            abb.inserir(num);
        }
        System.out.println("\n\narvore em ordem\n" + abb.inOrder());
        System.out.println("\nnumero de nos = " + abb.numeroNos());
        System.out.println("\naltura = " + abb.altura());
        System.out.println("\nmenor elemento = " + abb.menorElemento());
        System.out.println("\nnumero de folhas = " + abb.numeroFolhas());

        int x = r.nextInt(t);
        if (abb.existe(x)) {
            System.out.println(x + " foi encontrado");
        }
        else {
            System.out.println(x + " nao foi encontrado");
        }

        System.out.println(abb.proximo(110));
    }
}
