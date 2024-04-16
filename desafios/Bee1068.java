import java.util.Scanner;
import java.util.Stack;

public class Bee1068 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = " ";
        for (int n = 1; n < 10001 && s !=""; n++) {

            Stack<Character> stack = new Stack<>();
            s = scanner.nextLine();
            boolean estaCorreta = true;

            for (int i = 0; i < s.length() && estaCorreta == true; i++) {
                if (s.charAt(i) == '(') {
                    stack.push(s.charAt(i));
                } else if (s.charAt(i) == ')') {
                    if (stack.isEmpty())
                        estaCorreta = false;
                    else
                        stack.pop();
                }
            }
            if (!stack.isEmpty())
                estaCorreta = false;

            if (estaCorreta) {
                System.out.println("correct");
            } else {
                System.out.println("incorrect");
            }

        }

        scanner.close();
    }
}