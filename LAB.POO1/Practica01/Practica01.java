//Inicio: 8:37am; Finalizado 9:25am
//{paquetes}?
//com.duckysoft.miproyecto.principal;
//{importados}*
//import com.duckysoft.miproyecto.acciones.*;
//import com.duckysoft.miproyecto.vista.Ventana;
//definición de clase {public Practica01(){
    //Sentencias

public class Practica01 {// extends Parent implements Interface {
  //{atributos}*
  private String name;
  public float presupuesto;
  static int color = 5;
  protected boolean active;

  //{constructor}*
  public Practica01(){}

  //{metodo de ejecución principal}?
  public static void main(String[] args){
    //sentencias
    saludarYa();
    int colorDoble = getColorDoble(color);
    System.out.println(colorDoble);
  }
  //{metodos}*

  public static int getColorDoble(int x){
    return x*2;
  }
  public static void saludarYa(){
    System.out.println("Hola mundo");
  }

}
//}fin de definición de la clase
