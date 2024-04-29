import java.util.Random;

public class TesteFGen {
    public static void main(String[] args) {
        Fila_generica<Carro> fila = new Fila_generica<>();
        Random random = new Random();
        int ano = 2010;
        while (!fila.estaCheia()) {
            String numeros = "" + (random.nextInt(1, 9) * 1000
                    + random.nextInt(1, 9) * 100
                    + random.nextInt(1, 9) * 10
                    + random.nextInt(1, 9));
            String placa = "ABC-" + numeros;
            fila.enqueue(new Carro(placa, ano++));
            System.out.println(fila);
        }
        while (!fila.estaVazia()) {
            System.out.println(fila.dequeue() + " saiu");
        }
    }
}
