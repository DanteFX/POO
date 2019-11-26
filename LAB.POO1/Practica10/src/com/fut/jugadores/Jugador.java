package com.fut.jugadores;
import com.fut.utilerias.Posicion;
public class Jugador{
  protected String nombre;
  protected Posicion pos;
  public Jugador(String nombre, Posicion pos){
    this.nombre = nombre;
    this.pos = pos;
  }
  public String toString(){
    return nombre+" "+pos.getPosicion()+" "+pos.getCosto();
  }
  public float getCosto(){
    return pos.getCosto();
  }
}
