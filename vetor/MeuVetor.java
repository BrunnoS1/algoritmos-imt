import java.util.Random;

public class MeuVetor {
    private double[] v;
    private int ultimaPos;

    public MeuVetor(int capacidade) {
        v = new double[capacidade];
        ultimaPos = -1;
    }

    // metodos de acesso
    public int getUltimaPos() {
        return ultimaPos;
    }

    public double[] getV() {
        return v;
    }

    // metodos modificadores
    public void setUltimaPos(int pos) {
        if (pos >= 0 && pos < v.length) {
            this.ultimaPos = pos;
        } else {
            ultimaPos = v.length - 1;
        }
    }

    // metodo checar se passou do tamanho
    public boolean estaCheio() {
        return ultimaPos >= (v.length - 1);
    }

    // metodo checar se está vazio
    public boolean estaVazio() {
        return ultimaPos == -1;
    }

    // metodo para reset
    public void resetVetor() {
        ultimaPos = -1;
    }

    // adicionar int
    public void adiciona(int elemento) {
        if (estaCheio()) {
            redimensiona(v.length * 2);
            System.out.println("vetor = " + this);
        }
        // ultimaPos++;
        // v[ultimaPos] = elemento;
        v[++ultimaPos] = elemento;
    }

    // adicionar double no final
    public void adiciona(double elemento) {
        if (estaCheio()) {
            redimensiona(v.length * 2);
        }
        // ultimaPos++;
        // v[ultimaPos] = elemento;
        v[++ultimaPos] = elemento;
    }

    public void adiciona(double elemento, int posicao) {
        if (estaCheio()) {
            redimensiona(v.length * 2);
        }
        if (posicao > ultimaPos) {
            // adiciona no final
            adiciona(elemento);
        } else {
            // precisa arrastar
            int i;
            for (i = ultimaPos + 1; i > posicao; i--) {
                v[i] = v[i - 1];
            }
            v[i] = elemento;
            ultimaPos++;
        }
    }

    public double remove() {
        if (estaVazio())
            return 0;
        double aux = v[ultimaPos--];
        // atribui v[ultimaPos] depois subtrai 1 de ultimaPos
        if (v.length >= 10 && ultimaPos <= v.length / 4) {
            redimensiona(v.length / 2);
        }
        return aux;
    }

    public double remove(int pos) {
        if (estaVazio() || pos > ultimaPos || pos < 0)
            return 0;
        if (pos == ultimaPos)
            return remove();
        double aux = v[pos];
        int i;
        for (i = pos; i < ultimaPos; i++) {
            v[i] = v[i + 1];
        }
        if (v.length >= 10 && --ultimaPos <= v.length / 4) {
            redimensiona(v.length / 2);
        }
        return aux;
    }

    public boolean removeBool(double elemento) {
        // remove a primeira ocorrencia do elemento e devolve sucesso ou fracasso
        if (estaVazio()) return false;
        for (int i = 0; i < v.length; i++) {
            if (v[i] == elemento) {
                if (i == ultimaPos) v[i] = 0;
                else{
                    for (int j = i; j < v.length-1; j++) {
                        v[j] = v[j+1];
                    }
                }
                if (v.length >= 10 && --ultimaPos <= v.length / 4) {
                    redimensiona(v.length / 2);
                }
                return true;
            }
        }
        return false;
    }

    public boolean removeOrdenado(double elemento) {
        // usa busca binaria pra remover (precisa estar ordenado)
        if (estaVazio()) return false;
        Retorno r = new Retorno();
        r = buscaBinaria(elemento);
        if (r.getAchou()) {
            int i;
            for (i = r.getIndice(); i < v.length-1; i++) {
                v[i] = v[i+1];
                if (v.length >= 10 && --ultimaPos <= v.length / 4) {
                    redimensiona(v.length / 2);
                }
            }
            return true;
        } else {
            return false;
        }

    }

    public int removeAll(double elemento) {
        // remove todas as ocorrencias do elemento e devolve quantos foram removidos
        int contador = 0;
        if (estaVazio()) return 0;
        for (int i = 0; i < v.length; i++) {
            if (v[i] == elemento) {
                contador ++;
                if (i == ultimaPos) v[i] = 0;
                else{
                    for (int j = i; j < v.length-1; j++) {
                        v[j] = v[j+1];
                    }
                }
                i--;
                ultimaPos--;
            }
        }
        if (v.length >= 10 && ultimaPos <= v.length / 4) {
            redimensiona(v.length / 2);
        }
        return contador;
    }

    private void redimensiona(int novaCapacidade) {
        double[] aux = new double[novaCapacidade];
        for (int i = 0; i <= ultimaPos; i++) {
            aux[i] = v[i];
        }
        v = aux;
    }

    public void preencheVetor() {
        // preenche com numeros aleatorios
        Random r = new Random();
        for (int i = 0; i <= v.length - 1; i++) {
            adiciona(r.nextInt(v.length * 10) + 1);
        }
    }

    public void preencheVetor(int limite) {
        // preenche com numeros aleatorios
        Random r = new Random();
        for (int i = 0; i < v.length - 1; i++) {
            adiciona(r.nextInt(limite) + 1);
        }
    }

    public int bubblesort() {
        int cont = 0;
        for (int i = 1; i < v.length; i++) {
            for (int j = 0; j < v.length - i; j++) {
                if (v[j] > v[j + 1]) {
                    // usando + memoria
                    double aux = v[j];
                    v[j] = v[j + 1];
                    v[j + 1] = aux;

                    // usando + processamento
                    // v[j] = v[j] + v[j+1]; // 5 + 3 = 8
                    // v[j+1] = v[j] - v[j+1]; // 8 - 3 = 5
                    // v[j] = v[j] - v[j+1]; // 8 - 5 = 3
                }
                cont++;
            }
        }
        return cont;
    }

    public int insertionSort() {
        // cont = contador de comparacoes
        int cont = 0;
        for (int i = 0; i < v.length; i++) {
            double elemento = v[i];
            int j = i - 1;

            while (j >= 0 && v[j] > elemento) {
                v[j + 1] = v[j];
                j--;
                cont++;
            }

            v[j + 1] = elemento;
        }
        return cont;
    }

    public int selectionSort() {
        // cont = contador de comparacoes
        int cont = 0;
        for (int i = 0; i < v.length; i++) {
            int indice_minimo = i;
            for (int j = i + 1; j < v.length; j++) {
                if (v[j] < v[indice_minimo]) {
                    indice_minimo = j;
                }
                cont++;
            }

            if (indice_minimo != i) {
                double temp = v[i];
                v[i] = v[indice_minimo];
                v[indice_minimo] = temp;
            }
        }
        return cont;
    }

    public Retorno buscaSimples(double x) {
        Retorno r = new Retorno();
        for (int i = 0; i < v.length; i++) {
            r.incrementaContador();
            if (x == v[i]) {
                r.setAchou(true);
                return r;
            }
        }
        return r;
    }

    public Retorno buscaBinaria(double x) {
        Retorno r = new Retorno();
        int inicio = 0;
        int fim = v.length - 1;
        int meio;
        while (inicio <= fim) {
            meio = (inicio + fim) / 2;
            r.incrementaContador();
            if (v[meio] == x) {
                r.setAchou(true);
                r.setIndice(meio);
                return r;
            }
            if (x > v[meio]) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }
        return r;
    }

    @Override
    public String toString() {
        String s = "";
        if (estaVazio()) {
            s = s + "vetor vazio";
        } else {
            for (int i = 0; i <= ultimaPos; i++) {
                s += String.format("%.0f", v[i]) + " ";
            }
        }
        return s + "\n";
    }
}