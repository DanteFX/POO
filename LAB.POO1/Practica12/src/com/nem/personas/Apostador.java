package com.nem.personas;
public class Apostador extends Persona implements Comparable<Apostador>{
   private int dinero;
   private double puntos;
   public Apostador(String nombre, String apellido,int edad,double puntos,int dinero){
     super(nombre,apellido,edad);
     this.puntos=puntos;
     this.dinero=dinero;
   }
   @Override
   public String toString() {
     return super.toString()+" "+puntos+" "+dinero;
   }
   public int compareTo(Apostador a){
     return a.dinero-this.dinero;
   }
   public int getMoney(){
     return dinero;
   }
   public double getPts(){
     return puntos;
   }
}
