public class TesteRemocao {
    public static void main(String[] args) {
        ABB abb = new ABB();
        abb.inserir(40);
        abb.inserir(20);
        abb.inserir(60);
        abb.inserir(50);
        abb.inserir(45);
        abb.inserir(42);
        abb.inserir(55);
        abb.inserir(70);
        abb.inserir(65);
        abb.inserir(63);
        abb.inserir(80);
        abb.inserir(30);

        System.out.println("arvore = \n"+ abb.inOrder());

        if (abb.removeElemento(40)) {
            System.out.println("40 removido");
        }
        else {
            System.out.println("40 nao encontrado");
        }

        if (abb.removeElemento(42)) {
            System.out.println("42 removido");
        }
        else {
            System.out.println("42 nao encontrado");
        }
        
        System.out.println("arvore = \n"+ abb.inOrder());
    }
}
