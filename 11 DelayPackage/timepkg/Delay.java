package timepkg;

public class Delay {
  public static void seconds(int n) throws InterruptedException{
    System.out.println(n);
    Thread.sleep(1000);
    n--;
    if (n > 0) {
      seconds(n);
    }
  }
}
