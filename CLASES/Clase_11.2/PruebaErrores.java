public class PruebaErrores{
  public static void main(String[] args) {
    String strn = "123";
    System.out.println(strn);
    int n = Integer.parseInt(strn);
    System.out.println(n);
    String strn2 = "1a23";
    System.out.println(strn2);
    int n2 = 0;
    try {
      n2 = Integer.parseInt(strn2);
    }catch(NumberFormatException nfe){
      System.out.println("Error "+nfe);
    } catch(Exception e){
      System.out.println("Error desconocido "+ e);
    }

    System.out.println(n2);
    System.out.println("Hola soy Elias");
  }
}
