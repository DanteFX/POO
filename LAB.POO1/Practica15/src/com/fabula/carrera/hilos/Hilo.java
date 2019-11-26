package com.fabula.carrera.hilos;
import javax.swing.JLabel;
import javax.swing.JButton;
public class Hilo extends Thread {
  private String nombre;
  private JLabel label;
  private char letra;
  public Hilo(String nombre,int prioridad,JLabel etiqueta, char letra){
    this.nombre = nombre;
    this.label = etiqueta;
    this.letra = letra;
    super.setPriority(prioridad);
  }
  public void run(){
    String txtAnterior = "";
    for (Integer i = 0; i < 49; i++) {
      txtAnterior = label.getText();
      int espera = (int)(Math.random() * 1000);
      label.setText(txtAnterior+letra);
      try {
        Thread.sleep(espera);
      } catch(Exception e) {
      }
    }
    label.setText(txtAnterior+" Fin");
  }
}
