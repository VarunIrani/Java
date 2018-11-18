import static java.lang.System.*;

interface Area {
  final float PI = 3.1415926535F;

  float compute();
}

class Circle implements Area {
  float rad;

  Circle(float rad) {
    this.rad = rad;
  }

  public float compute() {
    return (PI * rad * rad);
  }
}

class Rectangle implements Area {
  float l, b;

  Rectangle(float l, float b) {
    this.l = l;
    this.b = b;
  }

  public float compute() {
    return (l * b);
  }
}

public class AreaInterface {
  public static void main(String[] args) {
    Rectangle rect = new Rectangle(3.5F, 4.0F);
    Circle circ = new Circle(4.5F);
    Area area;
    area = rect;
    out.printf("\nArea of rectangle: %.2f", area.compute());
    area = circ;
    out.printf("\nArea of circle: %.2f", area.compute());
  }
}
