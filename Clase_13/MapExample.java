import java.util.*;
public class MapExample {
  public static void main(String[] args) {
    Map map = new HashMap<>();
    map.put("one","list");
    map.put("second",new Integer(2));
    map.put("third","3rd");
    map.put("third","III");
    Set set1 = map.keySet();
    Collection collection = map.values();
    Set set2 = map.entrySet();
    System.out.println(set1 + "\n"+ collection +"\n"+set2);
  }
}
/* TAREA
LEER GENERICS*/
