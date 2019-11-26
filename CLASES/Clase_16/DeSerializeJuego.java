import java.io.*;
import java.util.Date;
public class DeSerializeJuego {
  DeSerializeDate(){
    Date d = null;
    try {
      FileInputStream f = new FileInputStream("date.ser");
      ObjectIntputStream s = new ObjectInputStream(f);
      d = (Date) s. readObject();
      s.close();
    } catch (Exception e){
      e.printStackTrace();
    }
    System.out.println("Deserialized Date Object from date.ser");
    System.out.println("Date:"+d);
  }
  public static void main(String[] args) {

  }
}
