package com.mx.tv.gameswinner.dragongame.utilerias;
public enum Ataque{
  HI("Alto",3),
  MED("Medio",2),
  LOW("Bajo",1);
  private final String nivel;
  private final int ataque;
  private Ataque(String nivel, int ataque){
    this.nivel = nivel;
    this.ataque = ataque;
  }
 public String getAtaque(){
   return nivel;
 }
 public int getNivel(){
   return ataque;
 }
}
