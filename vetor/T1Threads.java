public class T1Threads {
    public static void main(String[] args) {
        int capacidade = 1000000;
        byte iteracoes = 10;

        // try {
        // selectionSortThread.join();
        // bubbleSortThread.join();
        // insertionSortThread.join();
        // } catch (Exception e) {
        // e.printStackTrace();
        // }
        // }

        MeuVetor v1 = new MeuVetor(capacidade);
        MeuVetor v2 = new MeuVetor(capacidade);
        MeuVetor v3 = new MeuVetor(capacidade);

        Thread selectionSortThread = new Thread(new SelectionSort(v1, iteracoes));
        Thread bubbleSortThread = new Thread(new BubbleSort(v2, iteracoes));
        Thread insertionSortThread = new Thread(new InsertionSort(v3, iteracoes));

        selectionSortThread.start();
        bubbleSortThread.start();
        insertionSortThread.start();

        try {
            selectionSortThread.join();
            bubbleSortThread.join();
            insertionSortThread.join();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
