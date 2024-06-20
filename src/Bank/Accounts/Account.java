package Bank.Accounts;

import Bank.Client.Client;

public class Account {
  private static final int defaultAgency = 1;
  protected double balance = 0;

  private Client client;
  protected int agency;
  protected int accountNumber;


  public Account(Client client) {
    this.client = client;
    this.agency = Account.defaultAgency;
    this.accountNumber = (int) Math.round(Math.random() * 10000);

  }

  public int getAgency() {
    return agency;
  }

  public int getAccountNumber() {
    return accountNumber;
  }

  public void withdraw(double value) {
    if (value <= this.balance) {
      this.balance -= value;
    } else {
      throw new RuntimeException("Saldo insuficiente para realizar saque");
    }
  }

  public void deposit(double value) {
    this.balance += value;
  }

  public void moneyTransfer(double value, Account targetAccount) {
    if (value <= this.balance) {
      withdraw(value);
      targetAccount.deposit(value);
    } else {
      throw new RuntimeException("Saldo insuficiente para realizar transferência");
    }


  }

  public Client getClient() {
    return client;
  }

  public void printBankStatement() {
    System.out.println("=====Account Info=====");
    System.out.println(String.format("- Client Name: %s", this.client.getName()));
    System.out.println(String.format("- Agency: %s", this.agency));
    System.out.println(String.format("- Account: %s", this.accountNumber));
    System.out.println(String.format("- Account Type: %s", client.getAccountType()));
    System.out.println(String.format("- Total Balance: %.2f", this.balance));
  }
}
