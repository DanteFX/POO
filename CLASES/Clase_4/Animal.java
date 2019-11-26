//paquete
//importes
//Definición de clase
public class Animal {
  //Atributos
  private String nombre;
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
}//Fin clase Animal
