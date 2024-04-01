public class TesteNo {
    public static void main(String[] args) {
        Carta c1 = new Carta(5, "ouros");
        No<Carta> no1 = new No<Carta>(c1);

        Carta c2 = new Carta(4, "paus");
        No<Carta> no2 = new No<>(c2);

        No<String> no3= new No<>("Hello world");

        No<Integer> no4= new No<Integer>(8);

        No<No> no5 = new No<>(no1);

        System.out.println("No<Carta> no1 = " + no1);
        System.out.println("No<Carta> no2 = " + no2);
        System.out.println("No<String> no3 = " + no3);
        System.out.println("No<Integer> no4 = " + no4);
        System.out.println("No<No> no5 = " + no5);
    }
}
