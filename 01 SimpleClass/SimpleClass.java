import static java.lang.System.*;

class Hello {
  int age;
  String name;

  void getData() {
    name = "Varun";
    age = 18;
  }

  void putData() {
    out.println("Hello " + name + ". You are " + age + " years old.");
  }
}

class SimpleClass {
  public static void main(String args[]) {
    Hello hello = new Hello();
    hello.getData();
    hello.putData();
  }
}