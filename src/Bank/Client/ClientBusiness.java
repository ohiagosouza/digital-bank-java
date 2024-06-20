package Bank.Client;

public class ClientBusiness extends Client{
  public ClientBusiness(String name, String cnpj) {
    super(name, cnpj);
    this.accountType = "Business";
  }

  @Override
  public String toString() {
    return accountType;
  }
}
