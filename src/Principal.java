import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ContaTerminal contaTerminal = new ContaTerminal();

        System.out.println("Por favor, digite o número da agência;");
        String agency = scanner.next();
        contaTerminal.setAgency(agency);

        System.out.println("Por favor, digite seu nome completo;");
        String name = scanner.next();
        contaTerminal.setClientName(name);

        System.out.println("Por favor, digite o número da conta;");
        int numberAccount = scanner.nextInt();
        contaTerminal.setNumber(numberAccount);

        System.out.println("Por favor, digite o valor para déposito;");
        double balance = scanner.nextDouble();
        contaTerminal.setBalance(balance);

        scanner.close();

        String getName = contaTerminal.getClientName();
        String getAgency = contaTerminal.getAgency();
        double getBalance = contaTerminal.getBalance();
        int getNumber = contaTerminal.getNumber();

       String message = """
                        Olá {getName}, obrigado por criar uma conta em nosso banco!
                        sua agência é {getAgency}, 
                        conta {getNumber}
                        seu saldo {getBalance} já está disponível para saque!               
                        """;

        System.out.println(message);
    }
    
}
