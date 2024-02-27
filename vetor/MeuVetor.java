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

    // metodo para inserir elemento
    // public boolean adiciona(int elemento) {
    // if (estaCheio()) {
    // return false;
    // }
    // ultimaPos++;
    // v[ultimaPos] = elemento;
    // return true;
    // }

    // adicionar int
    public void adiciona(int elemento) {
        if (estaCheio()) {
            redimensiona(v.length*2);
            System.out.println("vetor = " + this);
            System.out.println("vetor aumentado");
        }
        // ultimaPos++;
        // v[ultimaPos] = elemento;
        v[++ultimaPos] = elemento;
    }

    // adicionar double
    public void adiciona(double elemento) {
        if (estaCheio()) {
            redimensiona(v.length*2);
            System.out.println("vetor = " + this);
            System.out.println("vetor aumentado");
        }
        // ultimaPos++;
        // v[ultimaPos] = elemento;
        v[++ultimaPos] = elemento;
    }

    public int remove() {
        if (estaVazio()) return 0;
        int aux = (int) v[ultimaPos--];
        // atribui v[ultimaPos] depois subtrai 1 de ultimaPos
        if (v.length >= 10 && ultimaPos <= v.length / 4) {
            redimensiona(v.length/2);
        }
        return aux;
    }

    private void redimensiona(int novaCapacidade) {
        double[] temp = new double[novaCapacidade];
        for (int i = 0; i <= ultimaPos; i++) {
            temp[i] = v[i];
        }
        v = temp;
    }

    public void preencheVetor(){
        Random r = new Random();
        for(int i = 0; i <= v.length-1; i++){
            adiciona(r.nextInt(60)+1);
        }
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