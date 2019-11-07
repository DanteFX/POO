//paquete
//importes
//Definición de la clase
public class Persona extends Animal{
  //Atributos
  private boolean pensante;
  //Constructor
  public Persona(String nombre, int patas, boolean pensante){
  super(nombre, patas);
  this.pensante = pensante;
  }
  public String verDetalles(){
    return super.verDetalles()+"\t"+pensante;
  }
  // public void imprimePatas(){
  //   System.out.println(patas);
  // }

}
