public enum Tipo{
  ACCI("ACCION", 10.5),
  TERR("TERROR",5.4),
  INFA("INFANTIL", 3.1),
  DRAM("DRAMA", 0.3);

  private final String titulo;
  private final double nivel;

  private Tipo(String titulo, double nivel){
    this.titulo = titulo;
    this.nivel = nivel;
  }
  public String getTitulo(){
    return titulo;
  }
  public double getNivel(){
    return nivel;
  }
}
