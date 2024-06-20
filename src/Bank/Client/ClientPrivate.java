package Bank.Client;

public class ClientPrivate extends Client {
  public ClientPrivate(String name, String cpf) {
    super(name, cpf);
    this.accountType = "Personal";
  }

  @Override
  public String toString() {
    return accountType;
  }
}
