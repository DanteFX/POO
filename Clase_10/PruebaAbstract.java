public class PruebaAbstract{
  public static void main(String[] args) {
    Hijo brayan = new Hijo("Brayan");
    brayan.llorar();
    brayan.sonreir();
    brayan.donarDinero();

    Padre kevin = new Hijo("Kevin");
    kevin.llorar();
    kevin.sonreir();
    kevin.donarDinero();
  }
}
