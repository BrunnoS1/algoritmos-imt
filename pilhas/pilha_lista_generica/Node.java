public class Node<Info> {
    private Info info;
    private Node<Info> proximo;

    public Node (Info info) {
        this.info=info;
        this.proximo=null;
    }

    public Info getInfo() {
        return info;
    }

    public Node<Info> getProximo() {
        return proximo;
    }

    public void setInfo(Info info) {
        this.info = info;
    }

    public void setProximo(Node<Info> proximo) {
        this.proximo = proximo;
    }

    @Override
    public String toString() {
        return "|" + info + "|";
    }
}
