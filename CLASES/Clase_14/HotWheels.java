public class HotWheels extends Wheels {
  protected String modelo;
  public HotWheels(int year, String body, String modelo){
    this.year=year;
    this.body=body;
    this.modelo=modelo;
  }

 public String toString() {
   return super.toString()+" "+modelo;
 }

  public int getYear(){
    return (int)(Math.random()*10);
  }
  public String getBody(){
    return body;
  }

}
