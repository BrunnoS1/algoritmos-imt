public class Teste1 {
    public static void main(String[] args) {
        MeuVetor v1 = new MeuVetor(4);
        System.out.println("ultima posicao depois da construcao: " + v1.getUltimaPos());
        System.out.println("meu vetor foi construido");
        System.out.println(v1);

        // v1.setUltimaPos(100);
        // System.out.println("ultima posicao depois do set: " + v1.getUltimaPos());
        // System.out.println("Meu vetor depois de estragar o controle dele");
        // System.out.println(v1);

        // if(v1.adiciona(4)){
        // System.out.println("Adicionou com sucesso");
        // } else{
        // System.out.println("Falha em adicionar, vetor cheio");
        // };
        // System.out.println(v1);

        for (int n = 1; n <= 100; n++) {
            v1.adiciona(n);
            System.out.println("n = " + n + ", tamanho do vetor = " + v1.getV().length);
        }
        System.out.println("\n\n");
        while (!v1.estaVazio()) {
            System.out.println(v1.remove() + " saiu da lista, capacidade atual = " + v1.getV().length);
        }
        for (int n = 1; n <= 32; n++) {
            v1.adiciona(n);
            System.out.println("n = " + n + ", tamanho do vetor = " + v1.getV().length);
        }
    }
}
