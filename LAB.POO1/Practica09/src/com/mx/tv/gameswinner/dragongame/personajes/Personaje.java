//Paquete
package com.mx.tv.gameswinner.dragongame.personajes;

//definición de la clase
public abstract class Personaje {
    //atributos
    protected String nombre;
    protected int vida = 3;
      //metodos
    public int obtenVida(){
      return vida;
    }//fin metodo obtenVida
    public boolean addVida(){
      return addVida(1);
    }//fin metodo addVida()
    public boolean addVida(int vida) {
      if (this.vida + vida > 99){
        return false;
      } else {
        this.vida += vida;
        return true;
      }
    }//fin metodo addVida(int vida)
    public abstract boolean decVida();
    public abstract boolean decVida(int vida);
    public String modificarNombre(String nombre) {
      this.nombre = nombre;
      return nombre;
    }//fin metodo modificarNombre
    public String obtenerDetalle(){
      String Svida = String.valueOf(vida);
      String detalle = nombre + " " + Svida+" ";
      return detalle;
    }//fin metodo obtenerDetalle

    public String toString(){
      return obtenerDetalle();
    }

    public boolean equals(Object o){
      if (o instanceof Personaje){
        Personaje tmp = (Personaje)o;
        if (vida == tmp.vida && nombre == tmp.nombre) {
          return true;
        }//fin estructura if
      }//fin estructura if
      return false;
    }//fin metodo equals
  }//fin de la clase
