import java.awt.Graphics;

import javax.swing.JApplet;

/* <applet code = "MyFirstApplet.java" width = 300 height = 300> </applet>*/

public class MyFirstApplet extends JApplet {
	
	public void paint(Graphics canvas) {
		
		int length = 100;	// Length of each side of square
		int gap = 20;
		
		for (int row = 0; row <= 2; row++) {	// for each row
			for (int col = 0; col <= 2; col++)	//for each column
			{
				int x = col*length;
				int y = row*length;
				
				// Draw a square in any case
				drawSquare (canvas, x, y, length);
		
				if (shouldDrawCircle (row, col)) {
					drawCircle (canvas, x + gap, y + gap, length - 2*gap);
				}
				else { // otherwise draw an X	
					int x1 = x + gap, 				y1 = y + gap;
					int x2 = x + length - gap, 		y2 = y + length - gap;
					drawX (canvas, x1, y1, x2, y2);
				}
			} // for
		} // for
		
		// Draw a line through the 3 straight X's.
		int xx = (int)1.5*length;
		int yy = 3*length - gap;

		
		canvas.drawLine (150, gap, 150, yy);
				
		// drawHappyFace (canvas);
	} // paint
	
	//-----------------------------------------
	private boolean shouldDrawCircle (int row, int col) {
		
		return (row == 0 && col == 2) || (row == 1 && col == 0) 
				|| (row == 1 && col == 2) || (row == 2 && col == 0);
		
	} // shouldDrawCircle
	
	//-----------------------------------------
	private void drawHappyFace (Graphics canvas)
	{
		//canvas.drawLine(0,0, 500, 500);
		canvas.drawLine(250, 0, 250, 500);
		canvas.drawOval(50, 50, 100, 100);
		canvas.fillOval(80, 85, 10, 10);
		canvas.fillOval(115, 85, 10, 10);
		canvas.drawArc(65, 100, 70, 30, 180, 180);
		
	} // drawHappyFace

	//-----------------------------------------
	private void drawSquare (Graphics canvas, int x, int y, int length)
	{
		canvas.drawRect(x, y, length, length);
		
	} // drawSquare
	
	//-----------------------------------------
	private void drawCircle (Graphics canvas, int x, int y, int diameter)
	{
		canvas.drawOval (x, y, diameter, diameter);
		
	} // drawCircle
	
	//-----------------------------------------
	private void drawX (Graphics canvas, int x1, int y1, int x2, int y2)
	{
		canvas.drawLine (x1, y1, x2, y2);
		canvas.drawLine (x2, y1, x1, y2);

	} // drawX
	
	
}
//Email: tkanchangwanchai@gmail.com
//Make Tic Tac Toe Table
//Fill in o and x on tic tac toe table
// make a horizontal line across xxx 
