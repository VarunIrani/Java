import timepkg.*;
import static java.lang.System.*;

class DelayPackage {
  public static void main(String[] args) throws InterruptedException {
    out.println("Start Timer...");
    Delay.seconds(5);
    out.println("Stop Timer...");
  }
}