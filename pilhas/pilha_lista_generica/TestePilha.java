public class TestePilha {
    public static void main(String[] args) {
        Pilha<Carta> p = new Pilha<Carta>();
        System.out.println(p);
        p.push(new Carta(2, "ouros"));
        System.out.println(p);
        for ( int i = 1; i < 11; i++) {
            p.push(new Carta(i, "espadas"));
        }
        System.out.println(p);
        System.out.println(p.pop() + " saiu da pilha");
        System.out.println("\n" + p);
        System.out.println("\n" + p.peek() + " esta no topo\n");

        while (!p.estaVazia()) {
            System.out.println(p.pop() + " foi removido");
        }

        System.out.println(p);
    }
}
