//Paquete
package com.mx.tv.gameswinner.dragongame.personajes;
//importes
import com.mx.tv.gameswinner.dragongame.utilerias.Escudo;
//definición de la clase
public class Planta extends Personaje{
  //atributos
  protected Escudo escudo;

  public Escudo getEscudo(){
    return escudo;
  }

  //constructor 1
  public Planta(String nombre,int vida, Escudo escudo){
    this.nombre = nombre;
    this.vida = vida;
    this.escudo = escudo;
  }//Fin constructor 1
  //constructor 2
  public Planta(String nombre, Escudo escudo){
    this(nombre,3,escudo);
  }//fin constructor 2
  //constructor 3
  public Planta(String nombre,int vida){
    this(nombre,vida,Escudo.NOPRO);
  }//fin constructor 3
  //constructor 4
  public Planta(String nombre){
    this(nombre,3,Escudo.NOPRO);
  }//fin constructor 4
  //metodos
  // public String obtenerDetalle(){
  //   return super.obtenerDetalle();
  // }
  public boolean decVida(){
    return decVida(1);
  }
  public boolean decVida(int vida){
    if (this.vida - vida * escudo.getProtection() < 0){
      return false;
    } else {
        this.vida -= vida * escudo.getProtection();
        return true;
    }//Fin estructura if
  }//fin metodo decVida(int vida)

  public String toString(){
    return super.toString()+" "+escudo.getEscudo();
  }

  public boolean equals(Object o){
    if (o instanceof Planta){
      Planta tmp = (Planta)o;
      if (vida == tmp.vida && nombre == tmp.nombre && tmp.escudo.getProtection() == escudo.getProtection()) {
        return true;
      }//fin estructura if
    }//fin estructura if
    return false;
  }//fin metodo equals
}//fin de la clase
