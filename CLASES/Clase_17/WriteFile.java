import java.io.*;
/*Elías Dávila Torres
  2019
*/
public class WriteFile {
  public static void main(String[] args) {
    String s;
    BufferedReader in = new BufferedReader(
      new InputStreamReader(System.in));
      String[] datos = new String[100];
      int i = 0;
      s = "";
      try {
        while ((s = in.readLine()) != null && !s.equals(" ")) {
          // System.out.println("Read: " + s);
          s = in.readLine();
          datos[i] = s;
          i++;
        }
        in.close();
      } catch(IOException e) {
        e.printStackTrace();
      }
      String fileOut ="Outfile.out";
      try {
        BufferedWriter bw = new BufferedWriter(new FileWriter(fileOut));
        for(String str: datos) {
          if(str == null) {
            break;
          }
          bw.write(str);
        }
        bw.close();
      } catch(IOException e) {
        e.printStackTrace();
      }
  }
}
