//Paquete
package com.mx.tv.gameswinner.dragongame.personajes;
//importes
//definición de la clase
public class Planta extends Personaje{
  //atributos
  private char escudo;
  public char escudo(){
    return escudo;
  }//fin metodo escudo
  //constructor 1
  public Planta(String nombre,int vida, char escudo){
    super(nombre,vida);
    this.escudo = escudo;
  }//Fin constructor 1
  //constructor 2
  public Planta(String nombre, char escudo){
    this(nombre,3,escudo);
  }//fin constructor 2
  //constructor 3
  public Planta(String nombre,int vida){
    this(nombre,vida,'A');
  }//fin constructor 3
  //constructor 4
  public Planta(String nombre){
    this(nombre,3,'A');
  }//fin constructor 4
  //metodos
  public String obtenerDetalle(){
    return super.obtenerDetalle() + escudo;
  }
  public boolean decVida(){
    return decVida(1);
  }
  public boolean decVida(int vida){
    if (escudo == 'A') {
      vida*=2;
    }
    return super.decVida(vida); //fin estructura if
  }//fin metodo decVida(int)
}//fin de la clase
