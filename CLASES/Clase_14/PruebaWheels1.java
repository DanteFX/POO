import java.util.LinkedList;

public class PruebaWheels1{
  public static void main(String[] args) {
    Wheels p = new Patineta(4,"Long",true);
    Wheels p2 = new Patineta(2,"Tabla flexible",false);
    Wheels h = new HotWheels(4, "xChasis", "El camino");
    Wheels h2 = new HotWheels(2, "Moto", "Italika");
    LinkedList<Wheels> ll = new LinkedList<Wheels>();
    ll.add(p);
    ll.add(p2);
    ll.add(h);
    ll.add(h2);
    for(Wheels tmp: ll) {
      System.out.println(tmp);
    }
  }
}
