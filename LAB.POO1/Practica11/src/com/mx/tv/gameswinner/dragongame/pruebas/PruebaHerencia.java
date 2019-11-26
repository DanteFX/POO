//Paquete
package com.mx.tv.gameswinner.dragongame.pruebas;
//importe
import com.mx.tv.gameswinner.dragongame.personajes.*;
import com.mx.tv.gameswinner.dragongame.utilerias.*;
//definición de la clase
public class PruebaHerencia {
  static int n = (int)(Math.random()*10);
  //Main
  public static void main(String[] args) {
    //Instancias
    Personaje per01 = new Planta("Adolfo", 99);
    Personaje per02 = new Planta("Alexis");
    Planta plan01 = new Planta("Azael",10,Escudo.PRO);
    Planta plan02 = new Planta("Carlos",50);
    Planta plan03 = new Planta("Cristian",Escudo.PRO);
    Planta plan04 = new Planta("Elias");
    Zombie zom01 = new Zombie("Estefania",80,Ataque.HI);
    Zombie zom02 = new Zombie("Karen",Ataque.HI);
    Zombie zom03 = new Zombie("Britany");
    Personaje[] personajes;
    personajes = new Personaje[9];
    personajes[0] = per01;
    personajes[1] = per02;
    personajes[2] = plan01;
    personajes[3] = plan02;
    personajes[4] = plan03;
    personajes[5] = plan04;
    personajes[6] = zom01;
    personajes[7] = zom02;
    personajes[8] = zom03;
    for (Personaje tmp :personajes ) {
      System.out.println(tmp.obtenerDetalle());
      if (tmp instanceof Planta) {
        System.out.println("Soy una planta");
        continue;
      }
      if (tmp instanceof Zombie) {
        System.out.println("Soy zombie");

      }
      tmp.decVida(n);
      System.out.println(tmp.obtenerDetalle());
    }
  }
}
