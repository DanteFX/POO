import java.util.Set;
import java.util.HashSet;

public class SetExample {
  public static void main(String[] args) {
    Set set = new HashSet();
    set.add("one");
    set.add("second");
    set.add("3rd");
    set.add(new Integer(4));
    set.add(new Float(5.0f));

    if(!set.add("second")) {
      System.out.println("No se aplicó");
    }
    if(!set.add(new Integer(4))) {
      System.out.println("No se aplicó");
    }
    System.out.println(set);
  }
}
