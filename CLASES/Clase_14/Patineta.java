public class Patineta extends Wheels {
  protected boolean trucks;
  public Patineta(int year, String body, boolean trucks){
    this.year = year;
    this.body = body;
    this.trucks = trucks;
  }
  public int getYear(){
    return year;
  }
  public String getBody(){
    return body;
  }
  public String toString() {
    return super.toString()+" "+trucks;
  }
}
