//definición de la clase
public class PruebaPersonaje {
  static int j = (int)(Math.random()*10000);
  static int n = (int)(Math.random()*10);
  //Main
  public static void main(String[] args) {
    //Instancia
    Personaje personaje = new Personaje ("Dante", j);
    //Ciclo for
    for(int i = 0; i<n; i++){
      System.out.println(personaje.obtenVida());
      //Incremento
      j = (int)(Math.random()*10000);
      personaje.addVida(j);
      //Condiciónes
      if (personaje.addVida(j)) {
        System.out.println("Incremento - ahora la vida es de" + " " + personaje.obtenVida());

      } else {
        System.out.println("No se puede agregar" + " " + j + " " + "a" + " " + personaje.obtenVida() );
      }
      j = (int)(Math.random()*10000);
      //Decremento

      personaje.decVida(j);
      //Condiciónes
      if (personaje.decVida(j)) {
        System.out.println("Decremento - ahora la vida es de" + " " + personaje.obtenVida());

      } else {
        System.out.println("No se puede restar" + " " + j + " " + "a" +" " + personaje.obtenVida() );
      }
    }//Fin ciclo for
    System.out.println("Vida final" + " " + personaje.obtenVida());
  }
}
