public class TestArray{
  public static void main(String[] args){
    Animal osa = new Animal("osa", 4);
    Persona amlo = new Persona("peje", 2, false);
    Animal cuper = new Animal("cuper", 3);
    Persona pena = new Persona("peña", 2, false);
    Animal[] animales = new Animal[4];
    animales[0] = osa;
    animales[1] = amlo;
    animales[2] = cuper;
    animales[3] = pena;
    // System.out.println(osa.verDetalles());
    // System.out.println(amlo.verDetalles());
    // amlo.imprimePatas();
    for (Animal a : animales ) {
      System.out.println(a.verDetalles());

    }
  }
}
