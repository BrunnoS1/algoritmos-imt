//lista duplamente ligada
public class Lista {
    private NoDuplo primeiro;
    private NoDuplo ultimo;
    // private int tamanho;

    public boolean estaVazia() {
        return primeiro == null;
    }

    public void insereInicio(int i) {
        NoDuplo novo = new NoDuplo(i);
        if (estaVazia()) {
            ultimo = novo;
        } else {
            novo.setProximo(primeiro);
            primeiro.setAnterior(novo);
        }
        primeiro = novo;
    }

    public void insereFim(int i) {
        NoDuplo novo = new NoDuplo(i);
        if (estaVazia()) {
            primeiro = novo;
        } else {
            novo.setAnterior(ultimo);
            ultimo.setProximo(novo);
        }
        ultimo = novo;
    }

    public int removeInicio() {
        if (estaVazia()) return 0;
        int info = primeiro.getInfo();
        primeiro = primeiro.getProximo();
        if (primeiro == null) { //esvaziou a lista
            ultimo = null;
        } else {
            primeiro.setAnterior(null);
        }
        return info;
    }

    public int removeFim() {
        if (estaVazia()) return 0;
        int info = ultimo.getInfo();
        ultimo = ultimo.getAnterior();
        if (ultimo == null) { //esvaziou a lista
            primeiro = null;
        } else {
            ultimo.setProximo(null);
        }
        return info;
    }

    @Override
    public String toString() {
        String s = "";
        if(estaVazia()) {
            s += "lista vazia";
        } else {
            s += "\\";
            NoDuplo aux = primeiro;
            while(aux != null) {
                s += aux + "=";
                aux = aux.getProximo();
            }
            s += "\\";
        }
        return s;
    }
}
