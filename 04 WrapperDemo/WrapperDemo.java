import static java.lang.System.*;
class WrapperDemo {
  public static void main(String[] args) {
    boolean bool = true;
    Boolean boolObj = new Boolean(bool);

    byte b = 2;
    Byte byteObj = new Byte(b);

    char c = 'c';
    Character charObj = new Character(c);

    double d = 4.0;
    Double doubleObj = new Double(d);

    float f = 6F;
    Float floatObj = new Float(f);

    int i = 9;
    Integer intObj = new Integer(i);

    long l = 12L;
    Long longObj = new Long(l);

    short s = 26;
    Short shortObj = new Short(s);

    out.println("   Boolean Object: " + boolObj);
    out.println("   Byte Object: " + byteObj);
    out.println("   Character Object: " + charObj);
    out.println("   Double Object: " + doubleObj);
    out.println("   Float Object: " + floatObj);
    out.println("   Integer Object: " + intObj);
    out.println("   Long Object: " + longObj);
    out.println("   Short Object: " + shortObj);
  }
}