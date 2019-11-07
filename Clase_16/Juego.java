import java.io.Serializable;
public class Juego implements Serializable {
  private String nombre;
  private int fecha;
  public Juego(String nombre, int fecha){
    this.nombre = nombre;
    this.fecha=fecha;
  }
  @Override
  public String toString() {
    return nombre+" "+fecha;
  }
}
