public class PruebaHilo {
  public static void main(String[] args){
    Thread hilo1 = new Thread(new Hilo(),"uno");
    Thread hilo2 = new Thread(new Hilo(),"dos");
    Thread hilo3 = new Thread(new Hilo(),"tres");
    hilo1.start();
    hilo2.start();
    hilo3.start();
  }
  //TAREA CAPTURAR CONSUMER PRODUCTOR
  //PUSH POP
}
