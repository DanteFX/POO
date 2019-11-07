import java.util.TreeSet;
import java.util.Comparator;
public class PruebaTree{
  public static void main(String[] args) {
    Equipos e1 = new Equipos("Santos Laguna", 26, 13);
    Equipos e2 = new Equipos("Necaxa", 25, 15);
    Equipos e3 = new Equipos("Queretaro", 24, 16);
    Equipos e4 = new Equipos("Leon", 23, 22);
    Equipos e5 = new Equipos("Tigres", 23, 12);
    Equipos e6 = new Equipos("America", 22, 4);
    Equipos e7 = new Equipos("Atlas", 21, 23);
    Equipos e8 = new Equipos("Monarcas", 19, 24);
    Equipos e9 = new Equipos("Pachuca", 18, 15);
    Equipos e10 = new Equipos("Pumas", 18, 17);

    TreeSet<Equipos> tmp = new TreeSet<Equipos>();
    tmp.add(e1);
    tmp.add(e2);
    tmp.add(e3);
    tmp.add(e4);
    tmp.add(e10);
    tmp.add(e6);
    tmp.add(e7);
    tmp.add(e8);
    tmp.add(e9);
    tmp.add(e5);
    for(Equipos e: tmp) {
      System.out.println(e);
    }
    Comparator c = new OrderByName();
    TreeSet<Equipos> tmp1 = new TreeSet<Equipos>(c);
    tmp1.add(e1);
    tmp1.add(e2);
    tmp1.add(e3);
    tmp1.add(e4);
    tmp1.add(e10);
    tmp1.add(e6);
    tmp1.add(e7);
    tmp1.add(e8);
    tmp1.add(e9);
    tmp1.add(e5);
    for(Equipos es: tmp1) {
      System.out.println(es);
    }
  }
}
