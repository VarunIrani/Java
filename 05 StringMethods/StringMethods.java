import java.io.*;
import static java.lang.System.*;

class StringMethods {
  void stringLength() {
    String name = "Varun Rustom Irani";
    out.println("Length of String " + name + " is: " + name.length());
  }

  void concatString() {
    String s1 = "Barry";
    String s2 = " Allen";
    out.println("Concatenating " + s1 + " and " + s2 + ": " + s1.concat(s2));
  }

  void charExtract() {
    String s = "Hello Java. You are 23 years old";
    int start = 0;
    int end = 9;
    char buffer[] = new char[end - start];
    s.getChars(start, end, buffer, 0);
    String es = new String(buffer);
    char ch = s.charAt(7);
    out.println("Original String: " + s);
    out.println("Extracted String: " + es);
    out.println("Extracted Character: " + ch);
  }

  void compStrings() {
    String s1 = "Hello";
    String s2 = new String(s1);
    String s3 = "HELLO";
    String s4 = "hello";
    out.println(s1 + " equals " + s2 + " -> " + s1.equals(s2));
    out.println(s1 + " == " + s2 + " -> " + (s1 == s2));
    out.println(s3 + " equals " + s4 + " -> " + s3.equals(s4));
    out.println(s3 + " equalsIgnoreCase " + s4 + " -> " + s3.equalsIgnoreCase(s4));
  }

  void charCase() {
    String s = "Whiplash";
    out.println(s + " in Uppercase: " + s.toUpperCase());
    out.println(s + " in Lowercase: " + s.toLowerCase());
  }

  void stringReplace() {
    int i;
    String org = "This is a test. This is too";
    String search = "is";
    String sub = "was";
    String result = "";
    do {
        out.println(org);
        i = org.indexOf(search);
        if (i != -1) {
            result = org.substring(0, i);
            result += sub;
            result += org.substring(i + search.length());
            org = result;
        }
    } while (i != -1);
  }

  void stringReverse() {
    StringBuffer orgString = new StringBuffer("Was it a cat I saw?");
    out.println("Original String: " + orgString.toString());
    String revString = orgString.reverse().toString();
    out.println("Reversed String: " + revString);
  }

  public static void main(String[] args) {
    int ch = 0;
    StringMethods sMethods = new StringMethods();
    out.println("******* STRING CLASS METHODS *******");
    out.println("1. Length of a String");
    out.println("2. String Concatenation");
    out.println("3. Character Extraction");
    out.println("4. String Comparison");
    out.println("5. Character Case");
    out.println("6. Substring");
    out.println("7. Reverse of String");
    out.println("8. Exit");
    out.print("Enter Your Choice: ");
    try {
        InputStreamReader is = new InputStreamReader(in);
        BufferedReader reader = new BufferedReader(is);
        ch = Integer.parseInt(reader.readLine());
    } catch (Exception e) {
        e.printStackTrace();
    }
    switch (ch) {
        case 1:
            sMethods.stringLength();
            break;
        case 2:
            sMethods.concatString();
            break;
        case 3:
            sMethods.charExtract();
            break;
        case 4:
            sMethods.compStrings();
            break;
        case 5:
            sMethods.charCase();
            break;
        case 6:
            sMethods.stringReplace();
            break;
        case 7:
            sMethods.stringReverse();
        case 8: 
            break;
    }
  }
}