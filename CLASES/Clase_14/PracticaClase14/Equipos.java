public class Equipos implements Comparable<Equipos>{
  private String nombre;
  private int puntos;
  private int gf;
  public Equipos(String nombre, int puntos, int gf){
    this.nombre = nombre;
    this.puntos = puntos;
    this.gf = gf;
  }

  public String toString() {
    return nombre + " " + puntos;
  }

  public int compareTo(Equipos e){
    return this.nombre+e.nombre;
  }
  public String getNombre(){
    return nombre;
  }
}
