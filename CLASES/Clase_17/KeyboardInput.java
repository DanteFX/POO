import java.io.*;
public class KeyboardInput {
  public static void main (String args[]) throws IOException{
    String s;
    BufferedReader in = new BufferedReader(
      new InputStreamReader(System.in));
    int[] datos = new int[100];
    s = "";
    int i = 0;
    while ((s = in.readLine()) != null && !s.equals("")) {
      // System.out.println("Read: " + s);
      s = in.readLine();
      datos[i] = Integer.parseInt(s);
      i++;
    }
    in.close();
    int canicas=0;
    for(int tmp: datos) {
      if(tmp == 0) {
        break;
      }
      //System.out.println(tmp);
      canicas+=tmp;
    }
    System.out.println(canicas);
  }
}
