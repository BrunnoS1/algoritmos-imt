public class TesteNode {
    public static void main(String[] args) {
        Carta c1 = new Carta(5, "ouros");
        Node<Carta> node1 = new Node<Carta>(c1);

        Carta c2 = new Carta(4, "paus");
        Node<Carta> node2 = new Node<>(c2);

        Node<String> node3= new Node<>("Hello world");

        Node<Integer> node4= new Node<Integer>(8);

        // Node<Node> node5 = new Node<>(node1);

        System.out.println("Node<Carta> node1 = " + node1);
        System.out.println("Node<Carta> node2 = " + node2);
        System.out.println("Node<String> node3 = " + node3);
        System.out.println("Node<Integer> node4 = " + node4);
        // System.out.println("Node<Node> node5 = " + node5);
    }
}
