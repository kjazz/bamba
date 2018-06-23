package example;

public class One3 { //TODO
  String message = "foo";

  public String foo() {
    return message;
  }

  public void uncoveredMethod() {
    System.out.println(foo());
  }
}
