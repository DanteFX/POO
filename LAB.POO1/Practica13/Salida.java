//Elías Dávila Torres
//8/11/2019
//importes
import java.io.*;
public class Salida {
  public static void main(String[] args) {
    String path = "./"+args[0];
    HerramientasArchivo hA = new HerramientasArchivo(path);
    File file = new File(path);
    if(file.isDirectory()) {
      System.exit(1);
    }
    if(file.exists() && file.canRead()){
      hA.leerArchivo();
    } else {
      System.exit(1);
    }
  }
}
