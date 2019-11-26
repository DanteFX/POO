package  com.nem.pruebas;
import java.util.LinkedList;
import java.util.TreeSet;
import java.util.ArrayList;
import com.nem.personas.*;
import java.util.Comparator;
import com.nem.util.*;
import java.util.Collections;
public class TestPractica13{
   public static void main(String[] args) {

      LinkedList<Persona> lista = new LinkedList<Persona>();
      lista.add( new Estudiante("REYES JOSUE", "CABRERA", 25, 15450669, 95));
      lista.add( new Estudiante("EMMANUEL", "CASTILLO", 22, 17450541, 72));
      lista.add( new Estudiante("LUIS FERNANDO", "CORREA", 23, 17450543, 82));
      lista.add( new Estudiante("ROSARIO", "LUNA", 23, 17450546, 74));
      lista.add( new Estudiante("RICARDO", "ECHANIZ", 23, 17450547, 55));
      lista.add( new Estudiante("JUAN PEDRO", "GAMBOA", 22, 17451014, 51));
      lista.add( new Estudiante("JOSE DANIEL", "GONZALEZ", 24, 16450511, 80));
      lista.add( new Estudiante("ALEJANDRA", "GONZALEZ", 19, 17450550, 54));
      lista.add( new Estudiante("KEVIN ALEXIS", "GUERRERO", 24, 18450144, 62));
      lista.add( new Estudiante("JOSUE", "MARTINEZ", 18, 17450558, 53));
      lista.add( new Estudiante("FERNANDO", "MEDINA", 24, 17450559, 52));
      lista.add( new Estudiante("MARTIN", "MONTOYA", 24, 16450917, 63));
      lista.add( new Estudiante("ERICK ALEJANDRO", "ORTIZ", 24, 17450561, 68));
      lista.add( new Estudiante("CARLOS MARCELO", "PALACIOS", 21, 17450563, 82));
      lista.add( new Estudiante("MAGALY", "RAMIREZ", 22, 17450570, 66));
      lista.add( new Estudiante("ALEJANDRO JOSUE", "ROJAS", 18, 16450542, 53));
      lista.add( new Estudiante("YESENIA SELENE", "ROSALES", 17, 17450574, 65));
      lista.add( new Estudiante("JORGE EDUARDO", "SAUCEDO", 25, 17450577, 64));
      lista.add( new Estudiante("LUIS MANUEL", "SEGOVIA", 20, 17450578, 67));
      lista.add( new Estudiante("EDGAR GERARDO", "SORIANO", 23, 16450546, 56));
      lista.add( new Estudiante("GEMA LIZETH", "SOSA", 23, 17450579, 59));
      lista.add( new Apostador("JUAN JOSE", "BASURTO", 89, 285675.0, 77));
      lista.add( new Apostador("RICARDO ALBERTO", "BENAVIDES", 58, 494515.0, 50));
      lista.add( new Apostador("CARLOS RAFAEL", "CONTRERAS", 78, 703655.0, 73));
      lista.add( new Apostador("JOEL ADRIAN", "CRUZ", 60, 250059.0, 58));
      lista.add( new Apostador("IRMA KARINA", "GARCIA", 25, 143612.0, 82));
      lista.add( new Apostador("MIGUEL ANGEL", "LOPEZ", 81, 49238.0, 100));
      lista.add( new Apostador("SALVADOR ERNESTO", "MOLINA", 89, 124553.0, 85));
      lista.add( new Apostador("GUADALUPE RAQUEL", "MURILLO", 51, 433467.0, 81));
      lista.add( new Apostador("JOSE ABRAHAM", "MUÑOZ", 46, 649309.0, 86));
      lista.add( new Apostador("YAZMIN IRENE", "PAÑOL", 54, 106851.0, 63));
      lista.add( new Apostador("MISSAEL", "PIZAÑA", 81, 307873.0, 54));
      lista.add( new Apostador("GUSTAVO DANIEL", "RAMIREZ", 55, 722971.0, 51));
      lista.add( new Apostador("KEVIN", "RAYGOZA", 60, 107195.0, 66));
      lista.add( new Apostador("BRAYAN ALEXIS", "RODRIGUEZ", 30, 747749.0, 51));
      lista.add( new Apostador("OSCAR", "SANTOS", 84, 634019.0, 59));
      lista.add( new Apostador("ISMAEL DE JESUS", "TORRES", 83, 540552.0, 92));
      Comparator c = new OrderByName();
      Comparator b = new OrderByMoney();
      Comparator d = new OrderByPts();
      TreeSet<Estudiante> estudiantes = new TreeSet<Estudiante>();
      ArrayList<Apostador> apostadores = new ArrayList<Apostador>();
      Estudiante e;
      Apostador a;
      for(Persona p: lista) {
        if(p instanceof Estudiante) {
          e = (Estudiante) p;
          estudiantes.add(e);
        }else{
          a = (Apostador) p;
          apostadores.add(a);
        }
      }
      Collections.sort(apostadores,c);
      int i = 1;
      System.out.println("********************************");
      for(Persona p: estudiantes) {
        System.out.println(i+" "+p);
       i++;
      }
       i = 1;
       System.out.println("*******************************");
      for(Persona p: apostadores) {
        System.out.println(i+" "+p);
        i++;
      }
      i=1;
      System.out.println("*******************************");
      Collections.sort(apostadores,b);
      for(Persona p: apostadores) {
        System.out.println(i+" "+p);
        i++;
      }
      i=1;
      System.out.println("*******************************");
      Collections.sort(apostadores,d);
      for(Persona p: apostadores) {
        System.out.println(i+" "+p);
        i++;
      }
   }
}
