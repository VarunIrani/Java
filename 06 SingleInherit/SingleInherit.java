import static java.lang.System.*;
class Calculation {
  int z;
  public void addition(int x, int y) {
    out.printf("\nAddition of %d and %d = %d", x, y, (x + y));
  }
  public void subtraction(int x, int y) {
    out.printf("\nSubtraction of %d and %d = %d", x, y, (x - y));
  }
}

class SingleInherit extends Calculation {
  void multiplication(int x, int y) {
    out.printf("\nMultiplication of %d and %d = %d", x, y, (x * y));
  }
  public static void main(String args[]) {
    int a = 16, b = 12;
    SingleInherit s = new SingleInherit();
    s.addition(a, b);
    s.subtraction(a, b);
    s.multiplication(a, b);
  } 
}