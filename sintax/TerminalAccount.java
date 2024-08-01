package sintax;

import java.util.Scanner;

public class TerminalAccount {
    public static void main(String[] args) {
        var account = createFromTerminal();
        var message = formatMessage(account);
        System.out.println(message);
    }

    public static String formatMessage(Account account) {
        return String.format(
                "Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque",
                account.clientName,
                account.branch,
                account.number,
                account.balance
        );
    }

    public static Account createFromTerminal() {
        var scanner = new Scanner(System.in);

        System.out.print("Número da conta: ");
        var number = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Número da agência: ");
        var branch = scanner.nextLine();

        System.out.print("Nome do cliente: ");
        var clientName = scanner.nextLine();

        System.out.print("Saldo da conta: ");
        var balance = scanner.nextDouble();

        scanner.close();
        return new Account(number, branch, clientName, balance);
    }

    public record Account(int number, String branch, String clientName, double balance) {
    }
}
