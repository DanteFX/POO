import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
public class Entrada {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Escribe nombre del archivo: ");
    String archivo = sc.next();
    System.out.println("Escribiste: "+ archivo);
    File f = new File(archivo);
    if(f.exists()) {
      if(f.isDirectory()) {
        String[] ls = f.list();
        for(String s: ls) {
          System.out.println(s);
        }
        crearArchivo(archivo,"Entrada.txt");
      } else {//Termina isDirectory
          System.out.println("Si se puede escribir "+f.canWrite());
      }
    } else {//Opción cuando no existe
        crearArchivo(".",archivo);
    }
  }//Fin del main
  public static void crearArchivo(String ruta, String nombre) {
    String miArchivo = ruta+System.getProperty("file.separator")+nombre;
    try {
      BufferedWriter bw = new BufferedWriter(new FileWriter(miArchivo));
      Scanner leer = new Scanner(System.in);
      int n = leer.nextInt();
      for (Integer i = 0; i < n; i++) {
        bw.write(ale()+","+ale());
        bw.newLine();
      }

      bw.close();
    } catch(IOException e) {
      e.printStackTrace();
    }
  }//Fin Metodo crearArchivo()
  public static String ale(){
    int x = (int)(Math.random()*100);
    return ""+x;
  }//Fin metodo ale()
}//Fin de la clase Entrada
