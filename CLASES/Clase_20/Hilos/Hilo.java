public class Hilo implements Runnable {
  public void run(){
    for (Integer i = 0; i < 50; i++) {
      System.out.println("Soy el hilo "+Thread.currentThread().getName()+" en "+i);
    }
  }
}
