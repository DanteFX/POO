import java.io.*;
public class SerializeDate {
  SerializeJuego() {
    Juego j = new Juego("DMC", 2000);
    try {
      FileOutputStream f = new FileOutputStream("date.ser");
      ObjectOutputStreams s = new ObjectOutputStream(f);
      s.writeObject(j);
      s.close();
    } catch(IOException e) {
      e.printStackTrace();
      }
  }
  public static void main(String[] args) {
    new SerializeJuego();
  }
}
