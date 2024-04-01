public class Carta {
    private int valor;
    private String naipe;

    public Carta (int valor, String naipe) {
        this.valor = valor;
        this.naipe = naipe;
    }

    public int getValor() {
        return valor;
    }
    public String getNaipe() {
        return naipe;
    }
    public void setValor(int valor){
        this.valor = valor;
    }
    public void setNaipe(String naipe) {
        this.naipe = naipe;
    }

    @Override
    public String toString() {
        return valor + " de " + naipe;
    }
}
