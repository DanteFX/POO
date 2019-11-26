package com.nem.util;
import java.util.Comparator;
import com.nem.personas.Persona;
public class OrderByName implements Comparator<Persona>{

  public int compare(Persona p1, Persona p2){
    return p1.getNombre().compareTo(p2.getNombre());
  }
}
