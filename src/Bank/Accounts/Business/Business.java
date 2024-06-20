package Bank.Accounts.Business;

import Bank.Accounts.Account;
import Bank.Client.Client;

public class Business extends Account {
  private String accountType;

  public Business(Client client) {
    super(client);
    this.accountType = "Business";
  }

  @Override
  public String toString() {
    return accountType;
  }
}
