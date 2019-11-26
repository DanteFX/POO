//Paquete
//Importes
//Definición de la clase
public class PruebaFor{
  //Atributos
  //Metodo principal
  public static void main(String[] args) {
    //Ciclo for números pares
    System.out.println("Números pares");
    short n = 1;
    for (int i=2; i<11 ;i=i+2) {
      System.out.println(i);
    }//Fin ciclo for
    //Ciclo for multiplos 3 y 4
    for (int i=1;i<11 ;i++ ) {
      short m3 = 3;
      int multiplo3 = 3*i;
      short m4 = 4;
      int multiplo4 = 4*i;
      if (multiplo3 < 10) {
        System.out.println("Multiplo 3");
        System.out.println(multiplo3);
          if (multiplo4 < 10){
            System.out.println("Multiplo 4");
            System.out.println(multiplo4);
          }//Fin estructura if
      }//Fin estructura if
    }//Fin ciclo for
  }//Fin Metodo Main
}//Fin clase
