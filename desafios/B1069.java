import java.util.Scanner;
import java.util.Stack;

public class B1069 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.nextLine();

        while (num-- > 0) {
            Stack<Character> diamantes1 = new Stack<>();
            String string = sc.nextLine();
            int diamantes = 0;

            for (int i = 0; i < string.length(); i++) {
                if (string.charAt(i) == '<')
                    diamantes1.push(string.charAt(i));
                if (string.charAt(i) == '>') {
                    if (!diamantes1.isEmpty()) {
                        diamantes1.pop();
                        diamantes++;
                    }
                }
            }
            System.out.println(diamantes);
        }
        sc.close();
    }
}