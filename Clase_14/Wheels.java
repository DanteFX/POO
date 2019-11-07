public abstract class Wheels implements Comparable<Wheels> {
  protected int year;
  protected String body;
  public abstract int getYear();
  public abstract String getBody();

  public String toString() {
    return year + " " + body;
  }
  public int compareTo(Wheels o){
    return this.year-o.year;
  }

}
