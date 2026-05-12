package py.edu.facitec.reutilizacion.paneles;

import java.awt.Graphics;
import java.awt.Image;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class PanelFondo extends JPanel{
	
	private Image fondo;
	
	public void setFondo(String imgFondo) {
		try {
			URL url = PanelFondo.class.getResource("/img/"+imgFondo);
			fondo = new ImageIcon(url).getImage();
			setOpaque(false);
			repaint();
		} catch (Exception e) {
		}
	}

	@Override
	public void paint(Graphics g) {
		g.drawImage(fondo,0,0,getWidth(),getHeight(),null);
		super.paint(g);
	}

}
