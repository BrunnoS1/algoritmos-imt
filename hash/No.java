public class No {
    private Pessoa info;
    private No proximo;
    //construtor para armazenar uma informação
    public No (Pessoa info) {
        this.info = info;
        setProximo(null); //por clareza
    }
    public Pessoa getInfo() {
        return info;
    }
    public No getProximo () {
        return proximo;
    }
    public void setInfo (Pessoa info) {
        this.info = info;
    }
    public void setProximo (No proximo) {
        this.proximo = proximo;
    }
    @Override
    public String toString() {
        return "|" + info + "| ";
    }
}