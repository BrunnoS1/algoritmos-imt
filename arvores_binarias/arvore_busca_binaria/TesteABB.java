import java.util.Random;

public class TesteABB {
    public static void main(String[] args) {
        Random r = new Random();
        ABB abb = new ABB();
        
        for (int i = 0; i < 12; i++) {
            int num = r.nextInt(0,100);
            System.out.println("gerado = " + num);
            abb.inserir(num);
        }
        System.out.println("\n" + abb.inOrder());
    }
}
