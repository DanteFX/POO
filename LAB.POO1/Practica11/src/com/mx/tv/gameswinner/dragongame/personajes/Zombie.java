//Paquete
package com.mx.tv.gameswinner.dragongame.personajes;
//importes
import com.mx.tv.gameswinner.dragongame.utilerias.Ataque;
//definición de la clase
public class Zombie extends Personaje{
  //atributos
  private Ataque ataque;
  public Ataque getAtaque(){
    return ataque;
  }
  //constructor 1
  public Zombie(String nombre, int vida, Ataque ataque){
    this.nombre = nombre;
    this.vida = vida;
    this.ataque= ataque;
  }//fin constructor 1
  //constructor 2
  public Zombie(String nombre, Ataque ataque){
    this(nombre,3,ataque);
  }//fin constructor 2
  //constructor 3
  public Zombie(String nombre){
    this(nombre,3,Ataque.LOW);
  }//fin constructor 3

  //metodos
  // public boolean ataque(){
  //   return ataque;
  // }
  // public String obtenerDetalle(){
  //   return super.obtenerDetalle()+" "+ataque;
  // }
  public boolean decVida(){
    return decVida(1);
  }
  public boolean decVida(int vida){
    if (this.vida - vida*ataque.getNivel() < 0){
      return false;
    } else {
      this.vida -= vida*ataque.getNivel();
      return true;
    }//Fin estructura if
  }//fin metodo decVida(int vida)

  public String toString(){
    return super.toString()+" "+ataque.getAtaque();
  }

  public boolean equals(Object o){
    if (o instanceof Zombie){
      Zombie tmp = (Zombie) o;
      if (vida == tmp.vida && nombre == tmp.nombre && tmp.ataque.getNivel() == ataque.getNivel()) {
        return true;
      }
    }
    return false;
  }
}//fin de la clase
