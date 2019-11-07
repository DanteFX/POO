import java.util.TreeSet;

public class Prueba2{
  public static void main(String[] args) {
    Wheels p = new Patineta(2000,"Tabla",true);
    Wheels p2 = new Patineta(1963,"Tabla flexible",false);
    Wheels h = new HotWheels(1978, "Chasis", "El camino");
    Wheels h2 = new HotWheels(1991, "Moto", "Italika");
    TreeSet<Wheels> ll = new TreeSet<Wheels>();
    ll.add(p);
    ll.add(p2);
    ll.add(h);
    ll.add(h2);
    for(Wheels tmp: ll) {
      System.out.println(tmp);
    }
  }
}
