public class TesteListaComUltimo {
    public static void main(String[] args) {
        ListaComUltimo lista = new ListaComUltimo();
        System.out.println("lista instanciada\n" + lista);
        System.out.println("\n *** preenchendo ***\n");
        for (int i = 1; i < 6; i++) {
            lista.insereInicio(i);
            System.out.println(lista);
            System.out.println("primeiro = " + lista.getPrimeiro());
            System.out.println("ultimo = " + lista.getUltimo() + "\n");
        }
        System.out.println("\n *** removendo ***\n");
        while (!lista.estaVazia()) {
            lista.removeFim();
            System.out.println(lista);
            System.out.println("primeiro = " + lista.getPrimeiro());
            System.out.println("ultimo = " + lista.getUltimo() + "\n");
        }
    }
}
