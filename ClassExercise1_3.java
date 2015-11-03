
import java.awt.Graphics;

import javax.swing.JApplet;


public class ClassExercise1_3 extends JApplet {

	public void paint(Graphics canvas){
		canvas.drawLine(70, 0, 70, 210);
		canvas.drawLine(140, 0, 140, 210);
		canvas.drawLine(0, 70, 210, 70);
		canvas.drawLine(0, 140, 210, 140);
		canvas.drawLine(0, 0, 210, 210);
		canvas.drawLine(70, 0, 0, 70);
		canvas.drawLine(140, 70, 70, 140);
		canvas.drawLine(210, 140, 140, 210);
		canvas.drawOval(70, 0, 70, 70);
		canvas.drawOval(140, 0, 70, 70);
		canvas.drawOval(0, 70, 70, 70);
		canvas.drawLine(5, 0, 205, 200);
	}

}
