
// GraphicsLab02st.java
// This is the student, starting version of the GraphicsLab02 assignment.

import java.awt.*;
import java.applet.*;

public class GraphicsLab02st extends Applet {
	public void paint(Graphics g) {
		int width = 980;
		int height = 630;
		int x1 = 10;
		int y1 = 640;
		int x2 = 990;
		int y2 = 640;

		int x3 = 990;
		int y3 = 640;
		int x4 = 10;
		int y4 = 640;

		int x5 = 10;
		int y5 = 640;
		int x6 = 10;
		int y6 = 10;
		int x7 = 990;
		int y7 = 640;
		int x8 = 990;
		int y8 = 10;

		int x9 = 796;
		int y9 = 446;
		int x10 = 201;
		int y10 = 446;

		int line = 0;
		int line2 = 0;

		g.drawRect(201, 201, 595, 245);
		g.drawRect(10, 10, width, height);

		while (line <= 70) {
			g.drawLine(x1, y1, x2, y2);
			line += 1;
			x1 += 14;
			y2 -= 9;
			g.drawLine(x3, y3, x4, y4);
			x3 -= 14;
			y4 -= 9;
			g.drawLine(x5, y5, x6, y6);
			x6 += 14;
			y5 -= 9;
			g.drawLine(x7, y7, x8, y8);
			x8 -= 14;
			y7 -= 9;

			while (line2 <= 60) {
				line2++;
				g.drawLine(x9, y9, x10, y10);
				x10 += 14;
				y9 -= 9;

			}
		}
	}
}
