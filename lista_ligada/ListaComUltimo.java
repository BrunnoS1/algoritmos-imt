public class ListaComUltimo extends Lista{
    private No ultimo;

    public No getUltimo() {
        return ultimo;
    }

    @Override
    public void insereFim(int i) {
        No novo = new No(i);
        if(estaVazia()) {
            setPrimeiro(novo);
            ultimo = novo;
        } else {
            ultimo.setProximo(novo);
            ultimo = novo;
        }
    }
}
