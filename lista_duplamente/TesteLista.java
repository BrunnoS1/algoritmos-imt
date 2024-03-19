import java.util.Random;

public class TesteLista {
    public static void main(String[] args) {
        Random r = new Random();
        Lista lista = new Lista();
        for (int i = 1; i < 20; i++) {
            if (r.nextInt(2) == 0) {
                System.out.println("\ninicio");
                lista.insereInicio(r.nextInt(100));
            } else {
                System.out.println("\nfim");
                lista.insereFim(r.nextInt(100));
            }
            System.out.println(lista);
            
        }
    }
}
