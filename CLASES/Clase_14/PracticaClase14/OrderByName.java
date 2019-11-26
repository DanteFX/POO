import java.util.Comparator;
public class OrderByName implements Comparator<Equipos>{
  public int compareTo(Equipos e1, Equipos e2){
    return e1.getNombre().compareTo(e2.getNombre());
  }
}
