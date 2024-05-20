import java.util.ArrayList;

public class ABB {
    private No raiz;

    public boolean estaVazia() {
        return raiz == null;
    }

    public void inserir(int info) {
        No novo = new No(info);
        if (estaVazia())
            raiz = novo;
        else
            insereRec(novo, raiz);
    }

    private void insereRec(No novo, No atual) {
        if (novo.getInfo() <= atual.getInfo()) {
            if (atual.getEsquerda() == null) {
                atual.setEsquerda(novo);
            } else {
                insereRec(novo, atual.getEsquerda());
            }
        }

        else {
            if (atual.getDireita() == null)
                atual.setDireita(novo);
            else
                insereRec(novo, atual.getDireita());
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
        return inOrderRec(atual.getEsquerda()) + " " + atual.getInfo() + " " + inOrderRec(atual.getDireita());
    }

    public int numeroNos() {
        if (estaVazia())
            return 0;
        return numeroNosRec(raiz);
    }

    private int numeroNosRec(No atual) {
        if (atual == null)
            return 0;
        return numeroNosRec(atual.getEsquerda()) + 1 + numeroNosRec(atual.getDireita());
    }

    public int altura() {
        if (estaVazia())
            return 0;
        return alturaRec(raiz);
    }

    private int alturaRec (No atual) {
        if (atual.getEsquerda() == null && atual.getDireita()==null) //não tem filhos
            return 0; 
        int alturaDir = 0;
        int alturaEsq = 0;
        if (atual.getEsquerda() != null) 
            alturaEsq = alturaRec(atual.getEsquerda());
        if (atual.getDireita() != null)
            alturaDir = alturaRec(atual.getDireita());
        return alturaEsq > alturaDir ? alturaEsq + 1 : alturaDir + 1;
    }

    public No menorElemento() {
        // menor sempre o mais a esquerda nessa implementacao 
        if (estaVazia()) return null;
        No menor = raiz;
        while (menor.getEsquerda() != null) {
            menor = menor.getEsquerda();
        }
        return menor;
    }

    public No maiorElemento() {
        // maior sempre o mais a direita nessa implementacao
        if (estaVazia()) return null;
        No maior = raiz;
        while (maior.getDireita() != null) {
            maior = maior.getDireita();
        }
        return maior;   
    }

    public int numeroFolhas () {
        if (estaVazia()) return 0;
        return numeroFolhasRec (raiz);
    }
    private int numeroFolhasRec (No atual) {
        if (atual == null) return 0;
        if (atual.getDireita() == null && atual.getEsquerda() == null) return 1;
        return numeroFolhasRec(atual.getDireita()) + numeroFolhasRec(atual.getEsquerda());
    }

    public boolean existe (int x) {
        if (estaVazia()) return false;
        return existeRec (x, raiz);
    }

    private boolean existeRec (int x, No atual) {
        if (atual == null) return false;
        if (x == atual.getInfo()) return true;
        if (x < atual.getInfo()) return existeRec (x, atual.getEsquerda());
        return existeRec(x, atual.getDireita());
    }

    public int proximo(int x) {
        if (estaVazia()) return -1;
        ArrayList<Integer> lista = new ArrayList<>();
        linearizaRec(lista,raiz);
        int posicao = lista.indexOf(x);

        return posicao == lista.size()-1? -1: lista.get(posicao+1);
    }

    private void linearizaRec(ArrayList<Integer> lista, No atual) {
        if (atual != null) {
            linearizaRec(lista, atual.getEsquerda());
            lista.add(atual.getInfo());
            linearizaRec(lista, atual.getDireita());
        }
    }
}
