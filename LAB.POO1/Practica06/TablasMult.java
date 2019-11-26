//Paquete
//Importe
//Definición de la clase
public class TablasMult{
  //Atributos
  //Metodo main
  public static void main(String[] args) {
    for (int i = 1; i<6 ;i++ ) {
      System.out.println("*****");
      for (int n = 1;n<11 ;n++ ) {
        if (n<=i) {
          System.out.println(i+"X"+n+"="+i*n);
          continue;
        }//Fin estructura if
      }//Fin ciclo for anidado
    }//Fin ciclo for principal
  }//Fin metodo main
}//Fin clase
