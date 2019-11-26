//Paquete
package com.mx.tv.gameswinner.dragongame.personajes;

//definición de la clase
public class Personaje {
    //atributos
    protected String nombre;
    protected int vida = 3;
    //constructor 1
    public Personaje(String nombre, int vida){
      this.nombre = nombre;
      if (vida >  0 && vida < 100){
        this.vida = vida;
      }//Fin estructura if
    }//Fin constructor 1
    //constructor 1
    public Personaje(String nombre){
      this(nombre,3);
    }//Fin constructor 2
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
    public boolean decVida(){
      return decVida(1);
    }//fin metodo decVida()
    public boolean decVida(int vida) {
      if (this.vida - vida < 0){
        return false;
      } else {
        this.vida -= vida;
        return true;
      }//Fin estructura if
    }//fin metodo decVida(int vida)
    public String modificarNombre(String nombre) {
      this.nombre = nombre;
      return nombre;
    }//fin metodo modificarNombre
    public String obtenerDetalle(){
      String Svida = String.valueOf(vida);
      String detalle = nombre + " " + Svida;
      return detalle;
    }//fin metodo obtenerDetalle
  }//fin de la clase
