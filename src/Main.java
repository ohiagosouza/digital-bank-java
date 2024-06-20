import Bank.Accounts.Business.Business;
import Bank.Accounts.Personal.Private;
import Bank.Client.ClientBusiness;
import Bank.Client.ClientPrivate;

public class Main {
  public static void main(String[] args) {
    ClientPrivate hiago = new ClientPrivate("Hiago Santana", "77159723040");
    Private accountA = new Private(hiago);

    ClientBusiness hiagoMedia = new ClientBusiness("Hiago Media LLC", "75487307000168");
    Business accountB = new Business(hiagoMedia);

    accountA.deposit(200);
    accountA.printBankStatement();
    accountB.printBankStatement();

    accountA.moneyTransfer(100, accountB);
    accountA.printBankStatement();
    accountB.printBankStatement();


  }
}
