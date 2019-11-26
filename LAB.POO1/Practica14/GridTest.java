import java.awt.*;
import javax.swing.*;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.awt.event.ActionEvent;
public class GridTest{
  private JFrame f;
  private JButton btnOpenFile;
  private JTextArea txtArea;
  private JLabel lblPalabras,lblLetras,lblNumeros,lblOtro;
  private JTextField txtFPalabras,txtFLetras,txtFNumeros,txtFOtro;
  public GridTest() {
    f = new JFrame("Grid Example");
    txtArea = new JTextArea("TextArea");
    btnOpenFile = new JButton("Abrir");
    lblPalabras = new JLabel("Palabras");
    lblLetras = new JLabel("Letras");
    lblNumeros = new JLabel("Números");
    lblOtro = new JLabel("Otro");
    txtFPalabras = new JTextField("");
    txtFLetras = new JTextField("");
    txtFNumeros = new JTextField("");
    txtFOtro = new JTextField("");
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }

  public void launchFrame() {
    f.setLayout (new GridLayout(10,10));
    f.add(txtArea);
    f.add(btnOpenFile);
    f.add(lblPalabras);
    f.add(txtFPalabras);
    f.add(lblLetras);
    f.add(txtFLetras);
    f.add(lblNumeros);
    f.add(txtFNumeros);
    f.add(lblOtro);
    f.add(txtFOtro);
    f.pack();
    f.setVisible(true);
    btnOpenFile.addActionListener(new java.awt.event.ActionListener(){
     public void actionPerformed(ActionEvent e){
       leerArchivo();
        }
    });
  }
  String file;
  String palabras;
  String letras;
  String numeros;
  String otros;
  public void leerArchivo(){
    final JFileChooser fileChoose = new JFileChooser();
    int returnVal = fileChoose.showOpenDialog(null);
        if(returnVal == JFileChooser.APPROVE_OPTION) {
            file = fileChoose.getSelectedFile().getAbsolutePath();
        }
    try {
      BufferedReader in
        = new BufferedReader(new FileReader(file));
      String s;
      s = in.readLine();
      while ( s != null ) {
        //System.out.println(s);
        s = in.readLine();
        txtArea.setText(s);
      }
      in.close();
    } catch (IOException e2) {
      e2.printStackTrace();
    }
  }

  public static void main(String args[]) {
    GridTest grid = new GridTest();
    grid.launchFrame();

  }
}
