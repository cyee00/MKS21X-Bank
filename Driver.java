public class Driver {
  public static void main(String[] args) {
    BankAccount account = new BankAccount(500.23, 12345, "password12345");
    System.out.println("Initial account info: " + account.toString());
    account.setPassword("NEWPassword");
    if (account.deposit(100)){
      System.out.println("Deposit successful!");
    } else {
      System.out.println("Deposit unsuccessful.");
    }
    System.out.println("Account after deposit of $100: " + account.toString());
    if (account.withdraw(1000)){
      System.out.println("Withdrawal successful!");
    } else {
      System.out.println("Withdrawal unsuccessful.");
    }
    System.out.println("Account after withdrawal of $1000: " + account.toString());
    if (account.withdraw(250)){
      System.out.println("Withdrawal successful!");
    } else {
      System.out.println("Withdrawal unsuccessful.");
    }
    System.out.println("Account after withdrawal of $250: " + account.toString());
  }
}
