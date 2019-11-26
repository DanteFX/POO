//Paquete
package com.mx.tv.gameswinner.dragongame.pruebas;
//importe
import com.mx.tv.gameswinner.dragongame.personajes.*;

//definición de la clase
public class PruebaPersonaje {
  static int j = (int)(Math.random()*100);
  static int n = (int)(Math.random()*10);
  //Main
  public static void main(String[] args) {
    //Instancias
    Personaje personaje = new Personaje ("Dante", j);
    Personaje per01 = new Personaje("Adolfo", 100);
    Personaje per02 = new Personaje("Alexis", 10);
    Personaje per03 = new Personaje("Azael", 1);
    Personaje per04 = new Personaje("Carlos", 0);
    Personaje per05 = new Personaje("Cristian", 5);
    System.out.println(per01.obtenerDetalle());
    System.out.println(per02.obtenerDetalle());
    System.out.println(per03.obtenerDetalle());
    System.out.println(per04.obtenerDetalle());
    System.out.println(per05.obtenerDetalle());
    Personaje per06 = per05;
    Personaje per07 = per04;
    Personaje per08 = per03;
    Personaje per09 = per02;
    Personaje per10 = per01;
    //Ciclo for
    /*for(int i = 0; i<n; i++){
      System.out.println(personaje.obtenVida());
      //Incremento
      j = (int)(Math.random()*100);
      //Condiciónes
      if (personaje.addVida(j)) {
        System.out.println("Incremento - ahora la vida es de" + " " + personaje.obtenVida());

      } else {
        System.out.println("No se puede agregar" + " " + j + " " + "a" + " " + personaje.obtenVida() );
      }
      j = (int)(Math.random()*100);
      //Decremento
      //Condiciónes
      if (personaje.decVida(j)) {
        System.out.println("Decremento - ahora la vida es de" + " " + personaje.obtenVida());

      } else {
        System.out.println("No se puede restar" + " " + j + " " + "a" +" " + personaje.obtenVida() );
      }
    }//Fin ciclo for
    System.out.println("Vida final" + " " + personaje.obtenVida());
    */
    per06.modificarNombre("Sam N");
    per08.modificarNombre("Sam V");
    per10.modificarNombre("Sam M");
    per07.addVida(j);
    per09.addVida(j+4);
    System.out.println("Paso 8");
    System.out.println(per01.obtenerDetalle());
    System.out.println(per02.obtenerDetalle());
    System.out.println(per03.obtenerDetalle());
    System.out.println(per04.obtenerDetalle());
    System.out.println(per05.obtenerDetalle());
  }
}
