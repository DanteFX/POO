public final class Perro extends Animal{
  public static final int PATAS_PERRO = 4;
  public String hocico;
  public Perro(String nombre, int patas, String hocico){
    super(nombre, patas);
    this.hocico = hocico;
  }
  public String toString(){
    return nombre;
  }
  // public String getVive(){
  //   return "Esta vivo y es un perro";
  // }
}
