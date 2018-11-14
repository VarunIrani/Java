import java.util.Scanner;
import static java.lang.System.*;
import java.io.*;

public class ConsoleIO {
  public static void main(String[] args) throws IOException{
    // Taking input using Scanner Class
    Scanner sc = new Scanner(in);
    BufferedReader reader = new BufferedReader(new InputStreamReader(in));

    out.print("Enter your full name: ");
    String fullName = sc.nextLine();
    out.println("Hello " + fullName);
    out.print("Please enter your age: ");
    if (sc.hasNextInt()) /*Checks whether user typed only an integer and not other value*/{
      int age = sc.nextInt();
      out.printf("Wow! You are %d years old.", age);
    }
    sc.close(); // Close the Scanner to disallow any other input 
    out.printf("\nEnter your percentage: ");
    double per = Double.parseDouble(reader.readLine());
    out.printf("%.2f is quite good.", per);
  }
}