public class ABB {
    // com repeticao e contador de ocorrencias
    private No raiz;

    public boolean estaVazia() {
        return raiz == null;
    }

    public void inserir(int info) {
        if (estaVazia())
            raiz = new No(info);
        else
            insereRec(info, raiz);
    }

    private void insereRec(int info, No atual) {
        if (info == atual.getInfo()) {
            atual.incrementaQ();
            
        } else if (info < atual.getInfo()) {
            if (atual.getEsquerda() == null)
                atual.setEsquerda(new No(info));
            else
                insereRec(info, atual.getEsquerda());
        } else {
            if (atual.getDireita() == null)
                atual.setDireita(new No(info));
            else
                insereRec(info, atual.getDireita());
        }
    }

    public String inOrder() {
        if (estaVazia())
            return "arvore vazia";
        return inOrderRec(raiz);
    }

    private String inOrderRec(No atual) {
        if (atual == null)
            return "";
        String s = "";
        //subarvore esquerda
        s += inOrderRec(atual.getEsquerda());
        //raiz
        for (int i = 1; i <= atual.getQuantidade(); i++) {
            s += atual.getInfo() + " ";
        }
        //subarvore direita
        s += inOrderRec(atual.getDireita());
        return s;
    }

    public int numeroNos() {
        if (estaVazia()) return 0;
        return numeroNosRec(raiz);
    }

    private int numeroNosRec(No atual) {
        if (atual == null) return 0;
        return numeroNosRec(atual.getEsquerda()) + 1 + numeroNosRec(atual.getDireita());
    }
}
