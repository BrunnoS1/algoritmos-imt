public class ListaComUltimo extends Lista {
    private No ultimo;

    public No getUltimo() {
        return ultimo;
    }

    @Override
    public int removeFim() {
        if (estaVazia())
            return 0;
        int info = ultimo.getInfo();
        No aux = getPrimeiro();
        if (getPrimeiro() == ultimo) {
            setPrimeiro(null);
            ultimo = null;
        } else {
            while (aux.getProximo() != ultimo) {
                aux = aux.getProximo();
                System.out.println("dentro do while aux = " + aux);
            }
            ultimo = aux;
            ultimo.setProximo(null);
        }

        return info;
    }

    @Override
    public void insereInicio(int i) {
        No novo = new No(i);
        No aux = getPrimeiro();
        setPrimeiro(novo);
        if (aux != null) {
            getPrimeiro().setProximo(aux);
        } else {
            ultimo = getPrimeiro();
        }
    }

    @Override
    public void insereFim(int i) {
        No novo = new No(i);
        if (estaVazia()) {
            setPrimeiro(novo);
            ultimo = novo;
        } else {
            ultimo.setProximo(novo);
            ultimo = novo;
        }
    }
}
