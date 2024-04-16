import java.io.IOException;
import java.util.Scanner;
 
public class Beecrowd1002 {
 
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        double raio = sc.nextDouble();
        double area = (raio * raio) * 3.14159;
        System.out.printf("A=%.4f%n", area);
        sc.close();
    }
 
}