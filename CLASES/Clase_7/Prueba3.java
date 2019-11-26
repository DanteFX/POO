public class Prueba3 {
  public static void main(String[] args) {
    int i = 1;
    boolean b = true;
    short a = 2;
    char c = 'a';
    byte y = 9;
    long l = 8l;
    double d = 7;
    float f = 6.5f;

    Integer ii = new Integer(1);
    Boolean bb = new Boolean(b);
    Short ss = new Short(a);
    Character cc = new Character('1');
    Byte yy = new Byte(y);
    Long ll = new Long(8l);
    Double dd = new Double(9);
    Float ff = new Float(6.5f);
    Integer x = 3;
    if (Character.isLetter(c)){
      System.out.println("Soy la letra soy la letra");
    }
    System.out.println(Integer.parseInt("123"));
    System.out.println(Double.parseDouble("987"));
    System.out.println(Integer.MAX_VALUE);
  }
}
