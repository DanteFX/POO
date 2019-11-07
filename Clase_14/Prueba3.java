import java.util.TreeSet;
import java.util.Comparator;

public class Prueba3{
  public static void main(String[] args) {
    Wheels p = new Patineta(4,"Long",true);
    Wheels p2 = new Patineta(2,"Tabla flexible",false);
    Wheels h = new HotWheels(4, "xChasis", "El camino");
    Wheels h2 = new HotWheels(2, "Moto", "Italika");
    Comparator c = new OrderByName();
    TreeSet<Wheels> ll = new TreeSet<Wheels>(c);
    ll.add(p);
    ll.add(p2);
    ll.add(h);
    ll.add(h2);
    for(Wheels tmp: ll) {
      System.out.println(tmp);
    }
  }
}
