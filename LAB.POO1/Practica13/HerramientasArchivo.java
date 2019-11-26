//Elías Dávila Torres
//8/11/2019
//importes
import java.io.*;
import java.util.Scanner;
import javax.script.ScriptEngineManager;
import javax.script.ScriptEngine;
//definición de lc clase
public class HerramientasArchivo{
  //atributos
  private String path;
  //metodo constructor
  public HerramientasArchivo(String path){
    this.path = path;
  }
  //metodos
  //metodo crearArchivo
  public void crearArchivo(){
    try {
      //hago una instancia del BufferedWriter
        BufferedWriter bw = new BufferedWriter(new FileWriter(path));
        try {
          //escribo el archivo
          bw.write("hola");
        } finally {
          bw.close();
        }
      } catch(IOException e){
        e.printStackTrace();
        System.exit(1);
      }
  }//fin metodo crearArchivo


  //metodo escribir archivo
  public void escribirArchivo(){
    BufferedReader in = new BufferedReader(
      new InputStreamReader(System.in));
    int s = 0;
    String input;
    boolean noEntero = true;
    try {
      while (noEntero) {
        System.out.print("¿Cuantas lineas quieres escribir? : ");
        Scanner sc = new Scanner(System.in);
        if(sc.hasNextInt()) {
          s = sc.nextInt();
          noEntero = false;
        }else{
          System.out.println("Error: Escribe un número valido");
        }//fin if else
      }//fin while
    }catch(Exception e) {
      e.printStackTrace();
    }//fin try
    int i = 0;
    try {
      BufferedWriter bw = new BufferedWriter(new FileWriter(path));

      try {
        while (i < s) {
          System.out.print("Escribe 2 números separados por coma : ");
          input = in.readLine();
          bw.write(input);
          bw.newLine();
          i++;
        }// fin estructura while
      } finally {
          bw.close();
        }//fin de finally
        } catch(Exception e) {
            e.printStackTrace();
            System.exit(1);
          }//fin de catch
  }//fin del metodo escribirArchivo

  //metodo leerArchivo
  public void leerArchivo(){
    ScriptEngineManager mgr = new ScriptEngineManager();
    ScriptEngine engine = mgr.getEngineByName("JavaScript");
    try {
      BufferedReader in
        = new BufferedReader(new FileReader(path));
      BufferedWriter bw = new BufferedWriter(new FileWriter("./salida.out"));
      String s;
      s = in.readLine();
      try {
        while ( s != null ) {
          if(s!=" ") {
            s = in.readLine().replaceAll(",","+");
            int i = (int) engine.eval(s);
            System.out.println(i);
            bw.write(i);
            bw.newLine();
          }
        }
      } catch(Exception e) {

      }
      // Close the buffered reader
      in.close();
      bw.close();
    } catch(Exception e) {
      e.printStackTrace();
    }
  }
}//fin de la clase
