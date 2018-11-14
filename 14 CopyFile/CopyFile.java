import static java.lang.System.*;
import java.io.*;

class CopyFile {
  public static void main(String[] args) throws IOException, FileNotFoundException{
    File file1 = new File("file1.txt");
    File file2 = new File("file2.txt");
    String file1Contents = "";

    // Read and store contents of file1.txt into String file1Contents
    FileReader fr = new FileReader(file1);
    BufferedReader br = new BufferedReader(fr);
    out.printf("\nReading Data from File 1 (file1.txt)...");
    file1Contents = br.readLine();
    out.printf("\nFile 1 contents: \n%s\n", file1Contents);
    br.close();

    // Write String file1Contents to file2.txt
    FileWriter fw = new FileWriter(file2);
    BufferedWriter bw = new BufferedWriter(fw);
    out.printf("\nWriting Data to File 2 (file2.txt)...");
    bw.write(file1Contents);
    bw.close();
  }
}