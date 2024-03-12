public class TesteNo {
    public static void main(String[] args) {
        No no1 = new No(10);
        No no2 = new No(20);
        System.out.println("No1 = " + no1);
        System.out.println("No2 = " + no2);

        no1.setProximo(no2);

        System.out.println(String.format("no1.getProximo %s", no1.getProximo()));
        System.out.println(String.format("no2.getProximo %s", no2.getProximo()));
    }
}
