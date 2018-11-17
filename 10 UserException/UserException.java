import static java.lang.System.*;

class InvalidProductException extends Exception {
  int w;

  InvalidProductException(int w) {
    this.w = w;
  }

  public String toString() {
    return "DrumStick Invalid: Inappropriate Weight " + w + "g";
  }
}

class DrumStick {
  String prodName;
  int weight;

  DrumStick(String prodName, int weight) {
    this.prodName = prodName;
    this.weight = weight;
  }

  void displayProduct() {
    out.printf("\nProduct Name: %s", this.prodName);
    out.printf("\nProduct Weight: %dg\n", this.weight);
  }
}

class UserException {
  static DrumStick[] drumsticks;

  public static void main(String[] args) throws Exception {
    drumsticks = new DrumStick[2];
    for (int i = 0; i < drumsticks.length; i++) {
      drumsticks[i] = new DrumStick("Drum Sticks Pack " + (i + 1), 0);
    }
    drumsticks[0].weight = 100;
    drumsticks[1].weight = 150;
    for (int j = 0; j < drumsticks.length; j++) {
      if (drumsticks[j].weight < 80 || drumsticks[j].weight > 140) {
        throw new InvalidProductException(drumsticks[j].weight);
      } else {
        drumsticks[j].displayProduct();
      }
    }
  }
}