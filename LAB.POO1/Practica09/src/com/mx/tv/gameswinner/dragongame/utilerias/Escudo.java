package com.mx.tv.gameswinner.dragongame.utilerias;
public enum Escudo{
  PRO("Protegido",3),
  NOPRO("No Protegido",1);
  private final String proteccion;
  private final int escudo;

  private Escudo(String proteccion, int escudo){
    this.proteccion = proteccion;
    this.escudo = escudo;
  }
  public String getEscudo(){
    return proteccion;
   }
  public int getProtection(){
    return escudo;
   }
}
