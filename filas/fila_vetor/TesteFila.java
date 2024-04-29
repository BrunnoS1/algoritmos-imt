import java.util.Random;

public class TesteFila {
    public static void main(String[] args) {
        Random random = new Random();
        // Fila_vetor<Integer> fila = new Fila_vetor<>();
        Fila_vetor fila = new Fila_vetor();
        fila.enqueue(random.nextInt(9));
        do {
            if (random.nextBoolean()) {
                if (!fila.estaCheia()) {
                    fila.enqueue(random.nextInt(9));
                }
            } else {
                if (!fila.estaVazia()) {
                    System.out.println(fila.dequeue() + " foi atedido");
                }
            }
            System.out.println(fila);
            System.out.println(fila.mostraVetor());
            System.out.println();
        } while (!fila.estaVazia());
    }
}
