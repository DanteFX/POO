package com.mx.tv.gameswinner.dragongame.pruebas;
import com.mx.tv.gameswinner.dragongame.personajes.*;
import com.mx.tv.gameswinner.dragongame.utilerias.AddException;
import java.util.Random;
public class PruebaException{
    public static void main(String[] args) {
      Personaje per01 = new Planta("Adolfo", 99);
      Personaje per02 = new Girasol("Alexis");
      Personaje per03 = new Zombie("Azael");
      Personaje[] personajes;
      personajes = new Personaje[3];
      personajes[0] = per01;
      personajes[1] = per02;
      personajes[2] = per03;

      Random r = new Random();

      for(Personaje p: personajes) {
        System.out.println(p);
        try {
          p.addVida(-100+r.nextInt((200)));
        } catch(AddException e) {
          System.out.println(e + " " + e.getNum() );
        }
      }
    }
}
