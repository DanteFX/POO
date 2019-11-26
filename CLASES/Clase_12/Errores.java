public class Errores extends Exception{

  public Errores(String message){
    super(message);
  }
  public static void errorNombre(String str)throws Errores{
    if(str.length() < 3 || str.length() > 80) {
      throw new Errores("La cadena es incorrecta");
    }
  }
  public static void errorEdad(int edad)throws Errores{
    if(edad < 18){
      throw new Errores("No bebe tu no puedes entrar");
    }
    if(edad > 50){
      throw new Errores("Es sugar daddy");
    }
  }
}
