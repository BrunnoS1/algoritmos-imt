public class Fila_generica<E> {
    private int primeiro;
    private int ultimo;
    private int quantidade;
    private E[] elementos;

    public static final int CAPACIDADE_MINIMA = 10;

    public Fila_generica(int capacidade) {
        elementos = capacidade > 10 ? (E[]) new Object[capacidade] : (E[]) new Object[CAPACIDADE_MINIMA];
        primeiro = 0;
        ultimo = capacidade - 1;
        quantidade = 0;
    }

    public Fila_generica() {
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

    private int anterior(int posicao) {
        return (posicao - 1) % elementos.length;
    }

    public boolean enqueue(E e) {
        if (estaCheia())
            return false;
        ultimo = proxima(ultimo);
        elementos[ultimo] = e;
        quantidade++;
        return true;
    }

    public E dequeue() {
        if (estaVazia())
            return null;
        E temp = elementos[primeiro];
        primeiro = proxima(primeiro);
        quantidade--;
        return temp;
    }

    @Override
    public String toString() {
        if (estaVazia())
            return "fila vazia";
        String s = "";
        int i = primeiro;
        do {
            s += elementos[i] + "\n";
            i = proxima(i);
        } while (i != proxima(ultimo));
        return s;
    }
}
