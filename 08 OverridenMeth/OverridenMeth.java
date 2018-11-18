import static java.lang.System.*;

class Pet {
  String name, type;

  Pet(String name, String type) {
    this.name = name;
    this.type = type;
  }

  void display() {
    out.printf("\nName of pet: %s", this.name);
    out.printf("\nType of pet: %s", this.type);
  }
}

class Dog extends Pet {
  String breed;
  int age;

  Dog() {
    super("Bozo", "Dog");
    this.breed = "Swedish Vallhund";
    this.age = 12;
  }

  void display() {
    super.display();
    out.printf("\nBreed of %s: %s", super.name, this.breed);
    out.printf("\nAge of %s: %d", super.name, this.age);
  }
}

class OverridenMeth {
  public static void main(String[] args) {
    Dog dog = new Dog();
    dog.display();
  }
}