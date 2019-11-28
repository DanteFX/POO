//Paquete
package com.mx.tv.gameswinner.dragongame.pruebas;
//importe
import com.mx.tv.gameswinner.dragongame.personajes.*;
//definición de la clase
public class PruebaGirasol{
  //atributos
  static int n = (int)(Math.random()*10);
  //metodo principal
  public static void main(String[] args) {
    //Instancias
    Personaje per01 = new Personaje("Adolfo",99);
    Personaje per02 = new Personaje("Alexis");
    Planta plan01 = new Planta("Azael", 10, 'B');
    Planta plan02 = new Planta("Carlos", 50);
    Planta plan03 = new Planta("Elias",'C');
    Planta plan04 = new Planta("Elias", 'C');
    Zombie zom01  = new Zombie("Estefania", 80, false);
    Zombie zom02  = new Zombie("Karen", true);
    Zombie zom03  = new Zombie("Britany");
    Girasol gira01 = new Girasol("Girasol");
    Girasol gira02 = new Girasol("Girasol");
    //arreglo
    Personaje[] personajes;
    personajes = new Personaje[11];
    personajes[0] = per01;
    personajes[1] = per02;
    personajes[2] = plan01;
    personajes[3] = plan02;
    personajes[4] = plan03;
    personajes[5] = plan04;
    personajes[6] = zom01;
    personajes[7] = zom02;
    personajes[8] = zom03;
    personajes[9] = gira01;
    personajes[10] = gira02;
    //ciclos for ( : ) {}
    for(Personaje o1 : personajes){
      for (Personaje o2 : personajes){
        System.out.print(o1);
        System.out.println("| " + o2);
        if( o1.equals(o2)){
          System.out.println("Son iguales : " + o1 +" y "+ o2);
        }

      //  o1.decVida(n);
        System.out.print(o1);
        System.out.println(o2);
        System.out.println("________________________________");
      }//fin ciclo for o2
    }//fin ciclo for o1
  }//fin metodo main
}//fin de la clase
