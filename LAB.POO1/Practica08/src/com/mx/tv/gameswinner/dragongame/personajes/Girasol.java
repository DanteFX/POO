//Paquete
package com.mx.tv.gameswinner.dragongame.personajes;
//definición de la clase
public class Girasol extends Planta{
  //atributos
  private int soles;
  //metodos
  public int getSoles(){
    return soles;
  }
  //constructor 1
  public Girasol(String nombre,int vida, char escudo, int soles){
    super(nombre,vida,escudo);
    this.soles = soles;
  }//Fin constructor 1
  //constructor 2
  public Girasol(String nombre, char escudo, int soles){
    this(nombre,3,escudo,soles);
  }//fin constructor 2
  //constructor 3
  public Girasol(String nombre,int vida, int soles){
    this(nombre,vida,'A',soles);
  }//fin constructor 3
  //constructor 4
  public Girasol(String nombre){
    this(nombre,3,'A',1);
  }//fin constructor 4
  //metodos

  public String toString(){
    return super.obtenerDetalle()+" soles = "+getSoles()+" ";
  }
  public boolean equals(Object o){
    if (o instanceof Girasol){
      Girasol tmp = (Girasol)o;
      if (vida == tmp.vida && nombre.equals(tmp.nombre) && escudo == tmp.escudo && soles == tmp.soles) {
        return true;
      }//fin estructura if
    }//fin estructura if
    return false;
  }//fin metodo equals
}//fin de la clase
