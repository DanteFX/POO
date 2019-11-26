import java.util.Properties;
import java.util.Enumeration;
public class Test {
  public static void main(String[] args) {
    Properties p  = System.getProperties();
  //  p.list(System.out);
    System.out.println("\\");
    System.out.println(System.getProperty("user.language"));
    System.out.println(System.getProperty("os.name"));
    System.out.println(System.getProperty("os.version"));
    System.out.println(System.getProperty("user.home"));
    System.out.println(System.getProperty("user.name"));
    System.out.println(System.getProperty("java.version"));
    for(String tmp: args) {
      System.out.println(tmp);
    }
    System.out.println(System.getProperty("tadeo"));
    int x = Integer.parseInt(System.getProperty("tadeo"));
    try {
      System.out.println(x+10);
    } catch(Exception e) {
      System.out.println(e);
    }

  }
}
