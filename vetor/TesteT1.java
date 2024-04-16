import java.util.Date;
public class TesteT1 {
    public static void main(String[] args) {
        int capacidade = 10000;

        Thread insertionThread = new Thread(()->{
            for (int i = 0; i < 1; i++){
                MeuVetor v = new MeuVetor(capacidade);
                v.preencheVetor();
                long inicio = new Date().getTime();
                v.insertionSort();
                long fim = new Date().getTime();
                System.out.println("tempo insertion = " + (fim - inicio));  
            }
        });

        Thread selectionThread = new Thread(()->{
            for (int i = 0; i < 1; i++){
                MeuVetor v = new MeuVetor(capacidade);
                v.preencheVetor();
                long inicio = new Date().getTime();
                v.insertionSort();
                long fim = new Date().getTime();
                System.out.println("tempo selection = " + (fim - inicio));  
            }
        });

        insertionThread.start();
        selectionThread.start();

        for (int i = 0; i < 1; i++) {
            MeuVetor v = new MeuVetor(capacidade);
            v.preencheVetor();
            long inicio = new Date().getTime();
            v.bubblesort();
            long fim = new Date().getTime();    
            System.out.println("tempo bubble = " + (fim - inicio)); 
        }
    }
}
