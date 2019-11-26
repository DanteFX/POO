//Paquete
package com.mx.tv.gameswinner.dragongame.personajes;
//importes
//definición de la clase
public class Planta extends Personaje{
  //atributos
  protected char escudo;
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

  public String toString(){
    return obtenerDetalle();
  }

  public boolean equals(Object o){
    if (o instanceof Planta){
      Planta tmp = (Planta)o;
      if (vida == tmp.vida && nombre == tmp.nombre && escudo == tmp.escudo) {
        return true;
      }//fin estructura if
    }//fin estructura if
    return false;
  }//fin metodo equals
}//fin de la clase
