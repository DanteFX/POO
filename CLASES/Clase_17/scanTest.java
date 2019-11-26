import java.io.*;
import java.util.Scanner;
public class scanTest {
  public static void main(String [] args) {
    Scanner s = new Scanner(System.in);
    String param=" ";
    do {
      param = s.next();
      System.out.println("the param 1" + param);
    } while (!param.equals("."));
    // int value = s.nextInt();
    // System.out.println("second param" + value);
    s.close();
  }
}
