package view;

import java.awt.*;
import java.awt.geom.Ellipse2D;

import javax.swing.*;

public class MyDisplay extends JPanel{

	private static final long serialVersionUID = 1L;

	//1.1/La class Graphics est une class abstraite sans constructeur publique qui nous permet de dessiner.
	//La class Graphics2D hérite de la class Graphics et nous donne plus de control sur les dessins que l'on fait dans l'aspect geometrie,
	//couleurs, coordonnées et bien d'autres.
	//La class JFrame hérite de la classe Frame et joue le role d'une fenetre dans laquelle on trouve les composants de l'interface.
	//La class JPanel est un conteneur qui stocke un groupe de composants et permet de les organiser.

	
	//1.4/
	@Override
	public void paintComponent(Graphics g) {
		//g.drawLine(100, 100, 300, 400);
		Ellipse2D ed = new Ellipse2D.Double(20.0d, 120.0d, 
                250.0d, 250.0d);
		Graphics2D g1 = (Graphics2D) g;
		g1.draw(ed);
	}

	//1.3/
	public static void main(String[] args) {
		JFrame frame = new JFrame("Java Avancé - Graphic Display");
		frame.setSize(new Dimension(500,500));
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		MyDisplay d = new MyDisplay();
		frame.add(d);
		frame.setVisible(true);

	}
	
	//1.5/La methode paintComponent() est aussi appelée lorsqu'on redimensionne la fenetre.
	
	//1.6/La différence fondamentale entre java.awt et javax.swing est que l'AWT est comme une boîte à outils qui contient les widgets 
	//et les fenêtres, graphiques etc., tandis que Swing, etant aussi une boite à outils, est une extension d'AWT.
}
