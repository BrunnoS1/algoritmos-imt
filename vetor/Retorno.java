public class Retorno {
    int contador;
    boolean achou;

    // metodos de acesso
    public int getContador() {
        return contador;
    }

    public boolean getAchou() {
        return achou;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    public void setAchou(boolean achou) {
        this.achou = achou;
    }

    public void incrementaContador() {
        contador++;
    }
}
