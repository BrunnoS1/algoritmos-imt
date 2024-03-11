public class Retorno {
    private int contador;
    private boolean achou;
    private int indice;

    // metodos de acesso
    public int getContador() {
        return contador;
    }

    public boolean getAchou() {
        return achou;
    }

    public int getIndice() {
        return indice;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    public void setAchou(boolean achou) {
        this.achou = achou;
    }

    public void setIndice(int indice) {
        this.indice = indice;
    }

    public void incrementaContador() {
        contador++;
    }
    public void incrementaIndice() {
        indice++;
    }
}
