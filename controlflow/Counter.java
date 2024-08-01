package controlflow;

import java.util.Scanner;

public class Counter {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        var from = scanner.nextInt();
        System.out.print("Digite o segundo número: ");
        var to = scanner.nextInt();
        scanner.close();

        try {
            count(from, to);
        } catch (InvalidParameterException ipe) {
            System.out.println("O segundo número deve ser maior que o primeiro");
        }
    }

    public static void count(int from, int to) {
        if (from >= to) {
            var message = String.format("Argument `to`(%d) must be bigger than `from`(%d)", to, from);
            throw new InvalidParameterException(message);
        }
        for (int i = from; i <= to; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}
