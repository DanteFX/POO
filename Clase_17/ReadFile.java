import java.io.*;
import java.util.Scanner;
public class ReadFile {
  public static void main (String[] args) {
    String archivo = null;
    if(args.length == 0) {
      Scanner sc = new Scanner(System.in);
      archivo = sc.next();
    } else {
      archivo = args[0];
    }
    // Create file
    File file = new File(archivo);
    if(!file.exists()) {
      System.out.println("Escribe un archivo valido");
      System.exit(-1);
    }
    try {
      // Create a buffered reader
      // to read each line from a file.
      BufferedReader in
        = new BufferedReader(new FileReader(file));
      String s;
      s = in.readLine();
      while ( s != null ) {
        System.out.println("Read: " + s);
        s = in.readLine();
      }
      // Close the buffered reader
      in.close();
    } catch (FileNotFoundException e1) {
      // If this file does not exist
      System.err.println("File not found: " + file);
    } catch (IOException e2) {
      // Catch any other IO exceptions.
      e2.printStackTrace();
    }
  }
}
