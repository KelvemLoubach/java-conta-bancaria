import java.util.Locale;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        ContaTerminal contaTerminal = new ContaTerminal();

        boolean controlLoop = false;

        while(!controlLoop){

        try{

        System.out.println("Por favor, digite o número da agência;");
        String agency = scanner.nextLine();
        contaTerminal.setAgency(agency);

        System.out.println("Por favor, digite seu nome completo;");
        String name = scanner.nextLine();
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
                        Olá %s, obrigado por criar uma conta em nosso banco!
                        sua agência é %s, 
                        conta %d
                        seu saldo %.2f já está disponível para saque!               
                        """.formatted(getName,getAgency,getNumber, getBalance );

        System.out.println(message);
        controlLoop = true; 

        }catch(java.util.InputMismatchException erro){
            System.out.println("Algum dado foi digitado incorretamente!");
        }
    }
}

 }

