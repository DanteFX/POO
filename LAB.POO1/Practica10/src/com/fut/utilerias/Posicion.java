package com.fut.utilerias;
public enum Posicion{
  POR("Portero",1000.00f),
  DEF("Defensa",2000.00f),
  MED("Medio",2500.00f),
  DEL("Delantero",654321.02f);
  private final String posicion;
  private final float costo;
  private Posicion(String posicion, float costo){
    this.posicion = posicion;
    this.costo = costo;
  }
  public String getPosicion(){
    return posicion;
  }
  public float getCosto(){
    return costo;
  }
}
