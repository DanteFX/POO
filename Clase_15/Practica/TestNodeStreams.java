import java.io.*;
/**Elías Dávila Torres @2019
**/
public class TestNodeStreams {
  public static void main(String[] args) {
    //tarea: hacer exception cuando tengas una version inferior de java
    try {
      String s = System.getProperty("file.separator");
      String path = System.getProperty("user.home")+s+"Documents"+s+args[0];
      String os = System.getProperty("os.name");
      String lang = System.getProperty("user.language");

      if((os.equals("Linux")) && (lang.equals("es"))){
        path = path.replace("Documents", "Documentos");
      }
      FileReader input = new FileReader(path);
      try {
        FileWriter output = new FileWriter(args[1]);
        try {
          char[] buffer = new char[128];
          int charsRead;
          charsRead = input.read(buffer);
          while ( charsRead != -1 ) {
            output.write(buffer, 0, charsRead);
            charsRead = input.read(buffer);
          }
        } finally {
          output.close();
          }
        } finally {
          input.close();
          }
        } catch (IOException e) {
          e.printStackTrace();
        }
  }
}
