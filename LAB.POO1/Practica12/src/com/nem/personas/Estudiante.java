package com.nem.personas;
public class Estudiante extends Persona implements Comparable<Estudiante> {
  private int matricula;
  private int promedio;
  public Estudiante(String nombre,String apellido, int edad,int matricula, int promedio){
    super(nombre,apellido,edad);
    this.matricula = matricula;
    this.promedio = promedio;
  }
  @Override
  public String toString() {
    return super.toString()+ " " +matricula+" "+promedio;
  }
  public int compareTo(Estudiante e){

    return e.promedio-this.promedio;
  }
}
