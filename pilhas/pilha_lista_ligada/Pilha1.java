public class Pilha1 {
    private No topo;

    public boolean estaVazia() {
        return topo == null;
    }

    public void push(int i) {
        No novo = new No(i);
        if(!estaVazia()) {
            novo.setProximo(topo);
        }
        topo = novo;
    }

    public int pop() {
        if (estaVazia()) return 0;
        int info = topo.getInfo();
        topo = topo.getProximo();
        return info;
    }

    public int peek() {
        if (estaVazia()) return 0;
        return topo.getInfo();
    }

    @Override
    public String toString() {
        String s = "lista: ";
        if (estaVazia()) {
            s += "vazia";   
        } else {
            No aux = topo;
            while (aux != null) {
                s += aux + "\n";
                aux = aux.getProximo();
            }
            s += "\\\\";
        }
        return s + "\n";
    }
}
