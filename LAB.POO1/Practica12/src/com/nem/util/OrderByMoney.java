package com.nem.util;
import java.util.Comparator;
import com.nem.personas.Apostador;
public class OrderByMoney implements Comparator<Apostador>{
  public int compare(Apostador p1, Apostador p2){
    return Integer.compare(p2.getMoney(),p1.getMoney());
  }
}
