public class Rua {
    public static void main(String[] args) {
        Fila<Carro> fila = new Fila<>();
        System.out.println(fila);

        Carro c1 = new Carro("ABC1234", 2010);
        Carro c2 = new Carro("XYZ5678", 2014);

        fila.enqueue(c1);
        System.out.println(fila);

        fila.enqueue(c2);
        System.out.println(fila);

        fila.enqueue(new Carro("DAK3918", 2023));
        System.out.println(fila);

        System.out.println(fila.dequeue() + " saiu da fila");
        System.out.println(fila);
    }
}
