package co.alurahotel.view;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class JPanelTransparente extends JPanel {
    
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Image imagen;
    
    @Override
    public void paint(Graphics g) {
        imagen = new ImageIcon(getClass().getResource("../imagenes/Background2.png")).getImage();
        g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
        setOpaque(false);
        super.paint(g);
    }
}
