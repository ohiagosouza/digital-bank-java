package Bank.Client;

public class Client {
  private String name;
  private String idNumber;
  protected String accountType;

  public Client(String name, String idNumber) {
    this.name = name;
    this.idNumber = idNumber;
  }

  public String getName() {
    return name;
  }

  public String getIdNumber() {
    return idNumber;
  }

  public String getAccountType() {
    return accountType;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setNumberId(String idNumber) {
    this.idNumber = idNumber;
  }
}
