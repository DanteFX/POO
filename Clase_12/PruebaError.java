public class PruebaError{

  public static void main(String[] args) {

    String test = "hola";
    int[] i = new int[5];
    i[0] = 15;
    i[1] = 17;
    i[2] = 21;
    i[3] = 51;
    i[4] = 72;

    try {
      Errores.errorNombre(test);
      Errores.errorEdad(15);
      Errores.errorEdad(21);
      Errores.errorEdad(51);
      } catch(Errores e) {
        System.out.println(e);
    }
  }
}
/*Tarea combinaciónes de set y List de colecciones*/
