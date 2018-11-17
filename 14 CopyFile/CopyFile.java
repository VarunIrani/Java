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
    char[] cbuf1 = new char[1024];
    int length;
    while ((length = r.read(cbuf1)) > 0) {
      w.write(cbuf1, 0, length);
    }
    String file1String = new String(cbuf1);
    out.printf("\nFile 1 Contents:\n\n%s", file1String);
    out.printf("\n\nFile 1 Contents Copied");
    r.close();
    w.close();

    r = new FileReader(file2);
    char[] cbuf2 = new char[1024];
    r.read(cbuf2);
    String file2String = new String(cbuf1);
    out.printf("\n\nFile 2 Contents:\n\n%s", file2String);
    r.close();
  }
}