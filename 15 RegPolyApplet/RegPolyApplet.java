import java.awt.*;
import java.applet.*;

public class RegPolyApplet extends Applet {
  private static final double PI = 3.1415926535;
  private static final int WIDTH = 1280;
  private static final int HEIGHT = 720;
  private static final int RAD = 200;

  public void paint(Graphics g) {
    Graphics2D g2d = (Graphics2D) g;
    int numberOfSides = 8;
    if (numberOfSides >= 3) {
      int xs[] = new int[numberOfSides + 1];
      int ys[] = new int[numberOfSides + 1];
      g2d.setColor(Color.RED);
      for (int i = 0; i < numberOfSides; i++) {
        xs[i] = (int) (RAD * Math.cos((2 * PI * i) / numberOfSides) + (WIDTH / 2));
        ys[i] = (int) (RAD * Math.sin((2 * PI * i) / numberOfSides) + (HEIGHT / 2));
      }
      xs[numberOfSides] = xs[0];
      ys[numberOfSides] = ys[0];
      g2d.setStroke(new BasicStroke(5));
      for (int i = 0; i < numberOfSides; i++) {
        g2d.drawLine(xs[i], ys[i], xs[i + 1], ys[i + 1]);
      }
    }
  }
}