public class ContaTerminal {

     private int number = 0;
     private String agency;
     private String clientName;
     private double balance;

     public void setNumber(int number){
        number = this.number;
     }
    
     public void setAgency(String agency){
        agency = this.agency;
     }

     public void setClientName(String clientName){
        clientName = this.clientName;
     }

     public void setBalance(double balance){
        balance = this.balance;
     }

     public int getNumber(){
        return number;
     }

     public String getAgency(){
        return agency;
     }

     public String getClientName(){
        return clientName;
     }

     public double getBalance(){
        return balance;
     }
}
