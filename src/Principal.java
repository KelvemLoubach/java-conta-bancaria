import java.util.Locale;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        ContaTerminal contaTerminal = new ContaTerminal();

        try {

            System.out.println("Por favor, digite o número da agência;");
            String agency = scanner.nextLine();
            contaTerminal.setAgency(agency);

            System.out.println("Por favor, digite seu nome completo;");
            String nameCliente = scanner.nextLine();
            contaTerminal.setClientName(nameCliente);

            System.out.println("Por favor, digite o número da conta;");
            int numberAccount = scanner.nextInt();
            contaTerminal.setNumber(numberAccount);

            System.out.println("Por favor, digite o valor para déposito;");
            double balanceAccoutn = scanner.nextDouble();
            contaTerminal.setBalance(balanceAccoutn);

            String getName = contaTerminal.getClientName();
            String getAgency = contaTerminal.getAgency();
            double getBalance = contaTerminal.getBalance();
            int getNumber = contaTerminal.getNumber();

            String message = """

                    ____________________________________________________________________________________________________________________

                            Olá %s, obrigado por criar uma conta em nosso banco!
                            Sua agência é: %s,
                            Sua conta é: %d
                            Seu saldo %.2f já está disponível para saque!
                    _____________________________________________________________________________________________________________________
                            """
                    .formatted(getName, getAgency, getNumber, getBalance);

            System.out.println(message);

            System.out.println("Deseja sacar algum valor? ( Digite 0 para não e 1 para sim)");
            int drawOrNot = scanner.nextInt();

            switch (drawOrNot) {
                case 1:
                    System.out.println("Qual o valor você quer sacar?");
                    double withdrawal = scanner.nextDouble();
                    double resultBalance = contaTerminal.withdrawMoney(withdrawal);

                    if (resultBalance == -1) {
                        System.out.println("Saldo insuficiente para esta operação!");
                    }

                    System.out.println("Seu saldo atual é: " + resultBalance+"0");

                    break;

                case 0:
                    break;

            }

            scanner.close();

        } catch (java.util.InputMismatchException erro) {
            System.out.println("Algum dado foi inserido incorretamente!");
        }

    }

}
