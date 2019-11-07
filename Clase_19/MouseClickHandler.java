import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class MouseClickHandler extends MouseAdapter {
// We just need the mouseClick handler, so we use
// an adapter to avoid having to write all the
// event handler methods
public void mouseClicked(MouseEvent e) {
// Do stuff with the mouse click...
JOptionPane.showMessageDialog(null, "Le diste click");
}
}
