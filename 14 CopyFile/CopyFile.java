import static java.lang.System.*;
import java.io.*;

class CopyFile {
  public static void main(String[] args) throws IOException, FileNotFoundException {
    File file1 = new File("file1.txt");
    File file2 = new File("file2.txt");
    Reader r = null;
    Writer w = null;

    r = new FileReader(file1);
    w = new FileWriter(file2);
    char[] cbuf = new char[1024];
    int length;
    while ((length = r.read(cbuf)) > 0) {
      w.write(cbuf, 0, length);
    }
    r.close();
    w.close();
  }
}