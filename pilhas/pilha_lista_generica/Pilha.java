public class Pilha<Info> {
    private Node<Info> topo;
    private int tamanho;

    public Node<Info> getTopo() {
        return topo;
    }

    public void setTopo(Node<Info> topo) {
        this.topo = topo;
    }

    public int getTamanho() {
        return tamanho;
    }

    public boolean estaVazia() {
        return topo == null;
    }

    public void push (Info info) {
        Node<Info> novo = new Node<Info>(info);
        if (!estaVazia()) novo.setProximo(topo); 
        topo = novo;
        tamanho++;
    }

    public Info pop() {
        if (estaVazia()) return null;
        Info info = topo.getInfo();
        topo = topo.getProximo();
        tamanho--;
        return info;
    }

    public Info peek() {
        if (estaVazia()) return null;
        return topo.getInfo();
    }

    @Override
    public String toString() {
        if (estaVazia()) return "pilha vazia"; 
        String s = "";
        Node<Info> aux = topo;
        while (aux != null) {
            s += aux + "\n";
            aux = aux.getProximo();
        }
        return s;
    }
}
