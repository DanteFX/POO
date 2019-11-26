package com.fut.pruebas;
import com.fut.utilerias.Posicion;
import com.fut.jugadores.Jugador;
public class PruebaCostos{
  public static void main(String[] args) {
    Jugador jug01 = new Jugador("Ronaldo", Posicion.POR);
    Jugador jug02 = new Jugador("Messi", Posicion.POR);
    Jugador jug03 = new Jugador("Rafa", Posicion.POR);
    Jugador jug04 = new Jugador("Chicharo", Posicion.POR);
    Jugador jug05 = new Jugador("Dante", Posicion.POR);
    Jugador jug06 = new Jugador("Gerardo", Posicion.POR);
    Jugador jug07 = new Jugador("Ochoa", Posicion.POR);
    Jugador jug08 = new Jugador("Corona", Posicion.POR);

    Jugador[] jugadores;
    jugadores = new Jugador[8];
    jugadores[0] = jug01;
    jugadores[1] = jug02;
    jugadores[2] = jug03;
    jugadores[3] = jug04;
    jugadores[4] = jug05;
    jugadores[5] = jug06;
    jugadores[6] = jug07;
    jugadores[7] = jug08;
    float costoEquipo = 0.0f;
    for (Jugador tmp :jugadores) {
      System.out.println(tmp);
      costoEquipo += tmp.getCosto();
    }
    System.out.println(costoEquipo);
  }
}
