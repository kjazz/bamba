package example;

public class One { //TODO
  String message = "foo";

  public String foo() { //TODO
    return message; //TODO
  } 

  public void uncoveredMethod() { //TODO
    System.out.println(foo());
	System.exit(1);
  }
	
}
