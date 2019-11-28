import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.LayoutManager;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.BufferedReader;
public class Prac14 {
	private int palabras = 0;
	private int letras = 0;
	private int numeros = 0;
	private int otro = 0;
	private JFrame jf;
	private JTextArea txtAreaContenido;
	private JTextField txtPalabras, txtLetras, txtNumeros, txtOtros;
	private JLabel lblPalabras, lblLetras, lblNumeros, lblOtros;
	private JButton btnAbrir;
  private String[] palabrasArray;
	private String contenido;


	public Prac14() {

		jf = new JFrame("Practica 14");
		txtAreaContenido = new JTextArea();
		txtAreaContenido.setText("");
		txtPalabras = new JTextField();
		txtLetras = new JTextField();
		txtNumeros = new JTextField();
		txtOtros = new JTextField();
		lblPalabras = new JLabel("Palabras: ");
		lblLetras = new JLabel("Letras: ");
		lblNumeros = new JLabel("Numeros: ");
		lblOtros = new JLabel("Otros: ");
		btnAbrir = new JButton("Abrir");
		jf.setLayout(new FlowLayout());
		jf.add(txtAreaContenido);
		jf.add(btnAbrir);
		jf.add(lblPalabras);
		jf.add(txtPalabras);
		jf.add(lblLetras);
		jf.add(txtLetras);
		jf.add(lblNumeros);
		jf.add(txtNumeros);
		jf.add(lblOtros);
		jf.add(txtOtros);

		txtPalabras.setText(String.valueOf(palabras));
		txtLetras.setText(String.valueOf(letras));
		txtNumeros.setText(String.valueOf(numeros));
		txtOtros.setText(String.valueOf(otro));

		jf.setSize(600,300);
		jf.setVisible(true);
    jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		btnAbrir.addActionListener(new ActionListener() {
			public void actionPerformed (ActionEvent e) {
				openFile();
			}
		});
	}

	public void openFile() {
		JFileChooser chooser = new JFileChooser();
		// FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos de Texto", "txt");
		// chooser.setFileFilter(filter);
		int selection = chooser.showOpenDialog(jf);
		if (selection == JFileChooser.APPROVE_OPTION) {
			String archivo = chooser.getSelectedFile().getAbsolutePath();
			readFile(archivo);
		} else {
			JOptionPane.showMessageDialog(jf,"Error");
		}
	}

	public void readFile(String ruta) {
		try {
			FileReader f = new FileReader(ruta);
			BufferedReader bf = new BufferedReader(f);
			String linea = bf.readLine();
			txtAreaContenido.setText("");
			while (linea != null) {
				txtAreaContenido.append(linea + "\n");
				linea = bf.readLine();
			}
			contenido = txtAreaContenido.getText();
			count(contenido);
		} catch (FileNotFoundException fnfe) {
			JOptionPane.showMessageDialog(jf,fnfe);
		} catch (IOException ioe) {
			JOptionPane.showMessageDialog(jf,ioe);
		}
	}

	public void count(String texto) {
		for (int x = 0;x < texto.length() ;x++) {
			if (Character.isDigit(texto.charAt(x))) {
			 	numeros++;
			}
			if (Character.isLetter(texto.charAt(x))) {
				letras++;
			}else {
				otro++;
			}
		}
		palabrasArray = texto.split(" ");
		palabras = palabrasArray.length;
		txtPalabras.setText("" + palabras);
		txtLetras.setText("" + letras);
		txtNumeros.setText("" + numeros);
		txtOtros.setText("" + otro);
	}

	public static void main(String[] args) {
		Prac14 gt = new Prac14();
	}
}
