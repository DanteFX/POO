//Paquete
package com.mx.tv.gameswinner.dragongame.personajes;
//importes
//definición de la clase
public class Zombie extends Personaje{
  //atributos
  private boolean ataque;
  //constructor 1
  public Zombie(String nombre, int vida, boolean ataque){
    super(nombre,vida);
    this.nombre = nombre;
    this.vida = vida;
  }//fin constructor 1
  //constructor 2
  public Zombie(String nombre, boolean ataque){
    this(nombre,3,ataque);
  }//fin constructor 2
  //constructor 3
  public Zombie(String nombre){
    this(nombre,3,false);
  }//fin constructor 3

  //metodos
  public boolean ataque(){
    return ataque;
  }
  public String obtenerDetalle(){
    return super.obtenerDetalle()+ ataque;
  }
  public boolean decVida(){
    return decVida(1);
  }
  public boolean decVida(int vida){
    if (ataque = false) {
      vida*=3;
    } else{
      vida*=2;
    }//fin estructura if
    return super.decVida(vida);
  }//fin metodo decVida
}//fin de la clase
