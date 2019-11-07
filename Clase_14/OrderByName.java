import java.util.Comparator;
public class OrderByName implements Comparator<Wheels>{
  public int compareTo(Wheels o1, Wheels o2){
    return o1.getBody().compareTo(o2.getBody());
  }
}
