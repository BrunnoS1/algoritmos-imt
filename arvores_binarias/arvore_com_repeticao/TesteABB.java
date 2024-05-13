import java.util.Random;

public class TesteABB {
    public static void main(String[] args) {
        Random r = new Random();
        ABB abb = new ABB();
        int t = r.nextInt(200) + 50;
        System.out.println("t = " + t);
        System.out.println("numeros gerados");
        for (int i = 0; i < t; i++) {
            int num = r.nextInt(t/3);
            System.out.print(num + " ");
            abb.inserir(num);
        }
        System.out.println("\n\narvore em ordem\n" + abb.inOrder());
        System.out.println("\nnumero de nos = " + abb.numeroNos());
    }
}
