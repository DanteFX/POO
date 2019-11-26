package com.fabula.carrera.ventanas;
import javax.swing.JFrame;
import com.fabula.carrera.hilos.Hilo;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
public class WinPrac15 extends JFrame {
  private JLabel tortuga,liebre;
  private JButton start;
  public WinPrac15(String title){
    setTitle(title);
    initComponents();
  }
  public void initComponents(){
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    tortuga = new JLabel("");
    liebre = new JLabel("");
    start = new JButton("Start");
    add(tortuga, BorderLayout.NORTH);
    add(liebre, BorderLayout.SOUTH);
    add(start, BorderLayout.CENTER);
    start.addActionListener(new java.awt.event.ActionListener(){
     public void actionPerformed(ActionEvent e){
       iniciarCarrera();
        }
    });
    setSize(800,100);
  }
  public void iniciarCarrera(){
    tortuga.setText("X");
    liebre.setText("0");
    Hilo h1 = new Hilo("Hilo 1", Thread.MAX_PRIORITY, tortuga, 'X');
    Hilo h2 = new Hilo("Hilo 2", Thread.MAX_PRIORITY, liebre, '0');
    h1.start();
    h2.start();
  }
}
