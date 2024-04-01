public class TesteLista {
    public static void main(String[] args) {
        ListaComUltimo lista = new ListaComUltimo();
        System.out.println("Lista instanciada\n" + lista);
        for (int i = 1; i < 6; i++) {
            lista.insereInicio(i*10);
            System.out.println(lista);
        }
        for (int i = 1; i < 6; i++) {
            lista.insereFim(i*10+5);
            System.out.println(lista);
        }
        System.out.println("removido do inicio = " + lista.removeInicio());
        System.out.println(lista);

        System.out.println("removido do fim = " + lista.removeFim());
        System.out.println(lista);

        while (!lista.estaVazia()) {
            // System.out.println(lista.removeInicio() + " foi removido");
            System.out.println(lista.removeFim() + " foi removido");
            System.out.println(lista);
        }
    }
}
