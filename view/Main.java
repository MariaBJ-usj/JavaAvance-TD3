package view;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main extends JPanel{

	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		JFrame frame = new JFrame("Java Avancé - Shape Display");
		frame.setSize(new Dimension(500,500));
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		ShapeDisplay d = new ShapeDisplay();
		frame.add(d);
		frame.setVisible(true);

	}
}

//Je n'ai pas su comment utiliser MouseController