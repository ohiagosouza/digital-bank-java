package Bank;

public class Bank {
  protected String name;
  protected int code;

  public Bank(String name, int code) {
    this.name = name;
    this.code = code;
  }

  public String getName() {
    return name;
  }

  public int getCode() {
    return code;
  }
}
