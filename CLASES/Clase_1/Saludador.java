//[paquete]
//[import]*
//def de clase open
public class Saludador{
  //atributos
  String saludo = "Ola k ace";
  String nombre;
  //metodos [Constructor]*
  public Saludador(String nomb){
    nombre = nomb;

  }
  public void saludar(){
    System.out.println(saludo+" "+nombre);
  }
  //def clase close
}
