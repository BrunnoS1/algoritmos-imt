public class Lista {
    private No primeiro;

    public No getPrimeiro() {
        return primeiro;
    }

    public void setPrimeiro(No primeiro) {
        this.primeiro = primeiro;
    }

    public boolean estaVazia() {
        return primeiro == null;
    }

    public void insereInicio(int i) {
        No novo = new No(i);
        if(!estaVazia()) {
            novo.setProximo(primeiro);
        }
        primeiro = novo;
    }

    public void insereFim(int i) {
        No novo = new No(i);
        if (estaVazia()) {
            primeiro = novo;
        } else {
            No aux = primeiro;
            while (aux.getProximo() != null) {
                aux = aux.getProximo();
            }
            aux.setProximo(novo);
        }
    }

    public int removeInicio() {
        int info = primeiro.getInfo();
        if (estaVazia()) return 0;
        primeiro = primeiro.getProximo();
        return info;
    }

    public int removeFim() {
        int i;
        if(primeiro.getProximo() == null) {
            // i = removeInicio();
            i = primeiro.getInfo();
            primeiro = null;
        } else {
            No aux = primeiro;
            while (aux.getProximo().getProximo() != null) { //até o penultimo
                aux = aux.getProximo();
            }
            i = aux.getProximo().getInfo();
            aux.setProximo(null);
        }
        return i;
    }

    @Override
    public String toString() {
        String s = "lista: ";
        if (estaVazia()) {
            s += "vazia";   
        } else {
            No aux = primeiro;
            while (aux != null) {
                s += aux;
                aux = aux.getProximo();
            }
            s += "\\\\";
        }
        return s + "\n";
    }
}
