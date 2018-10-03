public class BankAccount {
  private double b;
  private int a;
  private String p;
  public BankAccount(double balance, int accountID, String password) {
    b = balance;
    a = accountID;
    p = password;
  }
  public double getBalance() {
    return b;
  }
  public int getAccountID() {
    return a;
  }
  public void setPassword(String newPass) {
    p = newPass;
  }
  public String toString() {
    return a + "\t" + b;
  }
  public boolean deposit(int depositAmount) {
    if (depositAmount > 0) {
      b += depositAmount;
      return true;
    }
    return false;
  }
  public boolean withdraw(int withdrawalAmount) {
    if ((b - withdrawalAmount) >= 0) {
      b -= withdrawalAmount;
      return true;
    }
    return false;
  }
}
