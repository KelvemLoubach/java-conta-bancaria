public class ContaTerminal {

   private int number;
   private String agency;
   private String clientName;
   private double balance;

   public double withdrawMoney(double witchDraw) {

      if (witchDraw <= balance) {
         return balance -= witchDraw;

      }
      return -1;
   }

   public void setNumber(int number) {
      this.number = number;
   }

   public void setAgency(String agency) {
      this.agency = agency;
   }

   public void setClientName(String clientName) {
      this.clientName = clientName;
   }

   public void setBalance(double balance) {
      this.balance = balance;
   }

   public int getNumber() {
      return number;
   }

   public String getAgency() {
      return agency;
   }

   public String getClientName() {
      return clientName;
   }

   public double getBalance() {
      return balance;
   }
}
