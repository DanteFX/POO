//paquete
//importes
//Definición de clase
public class Animal {
  //Atributos
  protected String nombre;
  private int patas;
  //Metodo Constructor
  public Animal(String nombre, int patas){
    this.nombre = nombre;
    this.patas = patas;
  }
  //Metodos
  public String verDetalles(){
    return nombre + "\t" + patas;
  }
  public final String getVive(){
    return "Esta vivo";
  }
  public String getNombre(){
    return nombre;
  }
}//Fin clase Animal
