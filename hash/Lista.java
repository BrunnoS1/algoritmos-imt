public class Lista {
    private No primeiro;

    public Lista () {
        primeiro = null;
    }

    public boolean estaVazia() {
        return primeiro == null;
    }

    public void insere (Pessoa i) {
        No novo = new No(i);
        if (!estaVazia()) {
            novo.setProximo(primeiro);
        }
        primeiro = novo;
    }

    public Pessoa remove () {
        Pessoa i = primeiro.getInfo();
        primeiro = primeiro.getProximo();
        return i;
    }

    @Override
    public String toString() {
        String s = "";
        if (estaVazia()) {
            s += "vazia";
        }
        else {
            No aux = primeiro;
            while (aux != null) {
                s += aux;
                aux = aux.getProximo();
            }
        }
        return s + "\n";
    }
}

