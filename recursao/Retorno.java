public class Retorno {
    private int contador;
    private boolean achou;
    private int indice;
    private double valor;

    // metodos de acesso
    public int getContador() {
        return contador;
    }

    public double getValor() {
        return valor;
    }

    public boolean getAchou() {
        return achou;
    }

    public int getIndice() {
        return indice;
    }

    public void setCont(int contador) {
        this.contador = contador;
    }

    public void setValor(double valor) {
        this.valor = valor;
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
