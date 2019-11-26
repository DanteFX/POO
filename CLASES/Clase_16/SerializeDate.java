import java.io.*;
import java.util.Date;
public class SerializeDate {
  SerialDate() {
    Date d = new Date();
    try {
      FileOutputStream f = new FileOutputStream("date.ser");
      ObjectOutputStreams s = new ObjectOutputStream(f);
      s.writeObject(d);
      s.close();
    } catch(IOException e) {
      e.printStackTrace();
    }
  }
  public static void main(String[] args) {
    new SerializeDate();
  }
}
