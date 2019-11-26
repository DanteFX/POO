package com.nem.util;
import java.util.Comparator;
import com.nem.personas.Apostador;
public class OrderByPts implements Comparator<Apostador>{
  public int compare(Apostador p1, Apostador p2){
    return Double.compare(p2.getPts(),p1.getPts());
  }
}
