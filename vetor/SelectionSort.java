import java.util.Arrays;

public class SelectionSort implements Runnable{
    private MeuVetor v;
    private byte iteracoes;
    private long[] tempos;

    public SelectionSort(MeuVetor v, byte iteracoes) {
        this.v = v;
        this.iteracoes = iteracoes;
    }

    @Override
    public void run() {
        tempos = new long[iteracoes];
        for(int i = 0; i < iteracoes; i++){
            v.resetVetor();
            v.preencheVetor();
            long inicio = System.currentTimeMillis();
            v.selectionSort();
            long fim = System.currentTimeMillis();
            tempos[i] = (fim - inicio);
            System.out.println("tempo SelectionSort "+  (i+1) + "  = " + (fim - inicio) + "ms");
        }  
        System.out.println("Tempos SelectionSort = " + Arrays.toString(tempos));
    }
}
