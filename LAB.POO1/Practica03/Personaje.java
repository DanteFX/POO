//definición de la clase
public class Personaje {

  //atributos
  private String nombre;
  private int vida;
  //constructor
  public Personaje(String nombrePersonaje, int vidaPersonaje){

    nombre = nombrePersonaje;

    if (vidaPersonaje < 0 || vidaPersonaje > 99){

      vida = 3;

    }else {

      vida = vidaPersonaje;

    }


  }
    //metodos
  public int obtenVida(){

    return vida;

  }//fin metodo obtenVida

  public boolean addVida(){

    if (vida < 99) {

      this.vida = vida+1;

      return true;
    }
      return false;

  }//fin metodo addVida()
  public boolean addVida(int vida) {
    if (this.vida + vida <= 99 && this.vida + vida > 0) {
      this.vida = this.vida + vida;
      return true;
    }
      return false;


  }//fin metodo addVida(int vida)
  public boolean decVida(){

    if (vida <= 99 || vida > 0) {
      this.vida = vida-1;
      return true;
    }
      return false;

  }//fin metodo decVida()
  public boolean decVida(int vida) {

    if (this.vida - vida > 0) {
      this.vida = vida-1;

      return true;
    }
      return false;


  }//fin metodo decVida(int vida)
//fin de la clase
}
