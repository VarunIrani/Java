import static java.lang.System.*;

class Person {
  String name;
  int age;

  Person(String name, int age) {
    this.name = name;
    this.age = age;
    display();
  }

  void display() {
    out.printf("\nYour Name: %s", this.name);
    out.printf("\nYour Age: %d", this.age);
  }
}

class Student extends Person {
  long roll;
  int marks1, marks2;

  Student(long roll, int marks1, int marks2) {
    super("Varun Irani", 18);
    this.roll = roll;
    this.marks1 = marks1;
    this.marks2 = marks2;
    put();
  }

  void put() {
    out.printf("\nYour Roll Number: %d", this.roll);
    out.printf("\nYour Marks in first subject (/80): %d", this.marks1);
    out.printf("\nYour Marks in second subject (/80): %d", this.marks2);
  }
}

class Average extends Student {
  Average() {
    super(164016L, 73, 78);
    calculateAverage();
  }

  void calculateAverage() {
    float avg = (marks1 + marks2) / 2;
    out.printf("\nAverage of both subjects: %.2f", avg);
  }
}

class MultilevelInherit {
  public static void main(String[] args) {
    new Average();
  }
}