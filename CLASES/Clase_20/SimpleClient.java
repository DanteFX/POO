import java.net.*;
import java.io.*;
import java.util.Scanner;
public class SimpleClient {
  public static void main(String args[]) {
    Scanner in= new Scanner(System.in);
    System.out.print("Escribe la IP: ");
    String ip = in.next();
    System.out.print("Escribe el puerto: ");
    int port = in.nextInt();
    System.out.println();
    try {
      // Open your connection to a server, at port 5432
      // localhost used here
      Socket s1 = new Socket(ip, port);
      // Get an input stream from the socket
      InputStream is = s1.getInputStream();
      // Decorate it with a "data" input stream
      DataInputStream dis = new DataInputStream(is);
      // Read the input and print it to the screen
      System.out.println(dis.readLine());
      // When done, just close the steam and connection
      dis.close();
      s1.close();
    } catch (ConnectException connExc) {
        System.err.println("Could not connect.");
    } catch (IOException e) {
        e.printStackTrace();
      // ignore
    } // END of try-catch
  } // END of main method
} // END of SimpleClient program
