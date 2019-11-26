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
    Personaje personaje = new Planta ("Dante", j);
    Personaje per01 = new Planta("Adolfo", 100);
    Personaje per02 = new Planta("Alexis", 10);
    Personaje per03 = new Planta("Azael", 1);
    Personaje per04 = new Planta("Carlos", 0);
    Personaje per05 = new Planta("Cristian", 5);
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
