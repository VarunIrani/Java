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
        out.println(i);
    }
  }
}

class Thread2 extends Thread {
  public void run() {
    int n = 6;
    int a = 1, b = 1;
    int c;
    out.println(a);
    out.println(b);
    for (int i = 1; i <= n; i++) {
      c = a + b;
      out.println(c);
      a = b;
      b = c;
    }
  }
}

class MultiThread {
  public static void main(String[] args) {
    Thread1 t1 = new Thread1();
    Thread2 t2 = new Thread2();
    out.println("Prime Numbers");
    t1.start();
    out.println("Fibonacci Sequence");
    t2.start();
  }
}