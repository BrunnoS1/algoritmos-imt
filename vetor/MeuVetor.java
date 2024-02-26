public class MeuVetor {
    private int[] v;
    private int ultimaPos;

    public MeuVetor(int capacidade) {
        v = new int[capacidade];
        ultimaPos = -1;
    }

    // metodos de acesso
    public int getUltimaPos() {
        return ultimaPos;
    }

    public int[] getV() {
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

    // metodo para inserir elemento
    public boolean adiciona(int elemento) {
        if (estaCheio()) {
            return false;
        }
        ultimaPos++;
        v[ultimaPos] = elemento;
        return true;
    }

    @Override
    public String toString() {
        String s = "";
        if (estaVazio()) {
            s = s + "vetor vazio";
        } else {
            for (int i = 0; i <= ultimaPos; i++) {
                s += v[i] + " ";
            }
        }
        return s + "\n";
    }
}