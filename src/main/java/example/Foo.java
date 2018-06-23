public class Foo {
  public Collection<User> listUsers() {
    File userList = new File("/home/mylogin/Dev/users.txt"); // Non-Compliant
    Collection<User> users = parse(userList);
    return users;
  }
}
