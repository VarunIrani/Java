import static java.lang.System.*;

class Thread1 extends Thread {
  public void run() {
    int n = 20;
    boolean flag;
    for (int i = 2; i < n; i++) {
      flag = false;
      for (int j = 2; j <= i / 2; j++) {
        if (i % j == 0) {
          flag = true;
          break;
        }
      }
      if (!flag)
        out.println("PRIME " + i);
    }
  }
}

class Thread2 extends Thread {
  public void run() {
    int n = 6;
    int a = 1, b = 1;
    int c;
    out.println("FIBONACCI " + a);
    out.println("FIBONACCI " + b);
    for (int i = 1; i <= n; i++) {
      c = a + b;
      out.println("FIBONACCI " + c);
      a = b;
      b = c;
    }
  }
}

class MultiThread {
  public static void main(String[] args) {
    Thread1 t1 = new Thread1();
    Thread2 t2 = new Thread2();
    t1.setPriority(10);
    t2.setPriority(1);
    t1.start();
    t2.start();
  }
}