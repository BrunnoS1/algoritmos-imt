public class Fila_vetor {
    private int primeiro;
    private int ultimo;
    private int quantidade;
    private int[] elementos;

    public static final int CAPACIDADE_MINIMA = 10;

    public Fila_vetor(int capacidade) {
        elementos = capacidade > 10 ? new int[capacidade] : new int[CAPACIDADE_MINIMA];
        primeiro = 0;
        ultimo = capacidade - 1;
        quantidade = 0;
    }

    public Fila_vetor() {
        this(CAPACIDADE_MINIMA);
    }

    public boolean estaVazia() {
        return quantidade == 0;
    }

    public boolean estaCheia() {
        return quantidade == elementos.length;
    }

    private int proxima(int posicao) {
        return (posicao + 1) % elementos.length;
    }

    // private int anterior(int posicao) {
    //     return (posicao - 1) % elementos.length;
    // }

    public boolean enqueue(int o) {
        if (estaCheia())
            return false;
        ultimo = proxima(ultimo);
        elementos[ultimo] = o;
        quantidade++;
        return true;
    }

    public int dequeue() {
        // if (estaVazia()) return null;
        if (estaVazia())
            return -1;
        int temp = elementos[primeiro];
        primeiro = proxima(primeiro);
        quantidade--;
        return temp;
    }

    public String mostraVetor() {
        if (estaVazia())
            return "- - - - - - - - - -";
        String s = "";
        if (primeiro <= ultimo) {
            for (int i = 0; i < primeiro; i++)
                s += "_ ";
            for (int i = primeiro; i <= ultimo; i++)
                s += elementos[i] + " ";
            for (int i = ultimo + 1; i < elementos.length; i++)
                s += "_ ";
        } else {
            for (int i = 0; i <= ultimo; i++)
                s += elementos[i] + " ";
            for (int i = ultimo; i < primeiro; i++)
                s += "_ ";
            for (int i = primeiro; i < elementos.length; i++)
                s += elementos[i] + " ";
        }
        return s;
    }

    @Override
    public String toString() {
        if (estaVazia())
            return "fila vazia";
        String s = "";
        int i = primeiro;
        do {
            s += elementos[i] + " ";
            i = proxima(i);
        } while (i != proxima(ultimo));
        return s;
    }
}
