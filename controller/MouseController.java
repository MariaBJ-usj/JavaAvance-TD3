package controller;

import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

//3.2/A partir de la classe MouseMotionListener, on peut cr�� un objet �couteur qui traite des evenements li�s aux mouvements de 
//la souris. 

public class MouseController implements MouseMotionListener{

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		    int x ,y;
		    x=e.getX();
		    y=e.getY();
		    
	}

}
