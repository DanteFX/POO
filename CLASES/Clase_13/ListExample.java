import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
public class ListExample {
  public static void main(String[] args) {
    List list = new ArrayList();
    List l2 = new LinkedList();
    list.add("One");
    list.add("Second");
    list.add("3rd");
    list.add(new Integer(4));
    list.add(new Float(5.0f));
    if(!list.add("second")) {
      System.out.println("No se agregó");
    }
    list.add(new Integer(4));
    System.out.println(list);
  }
}
