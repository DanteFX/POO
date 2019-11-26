//Paquete
//Importes
//Definición de la clase
public class PruebaCiclos {
  //Atributos
  //metodo principal
  public static void main(String[] args){
        //ciclo for
         System.out.println("for:");
         for(short i=1;i<11; i++){
              System.out.println(i);
         }//Fin ciclo for
         //ciclo while
         short i = 0;
         System.out.println("while:");
         while (i<10) {
           i+=1;
           System.out.println(i);
         }//Fin ciclo while
         //ciclo do while
         System.out.println("do while:");
         short n = 1;
         do {System.out.println(n);
           n+=1;
         } while (n<11);
    }//Fin metodo principal
}//Fin de la clase
