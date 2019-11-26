public class Mario {

  private int vida = 98;
    public void addVida() {
      vida = (vida < 99)? vida+1:vida;
    }
  public int getVida() {
    return vida;
  }

}
