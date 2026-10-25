import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
import java.util.*;

public class Square extends JComponent implements Shapes
{
   private int x = 500;
   private int y = 500;
   private int side = 200;
   private Color shapeColor = Color.black;

   public Square(Color backColor, Color color)
   {
     	setBackground(backColor);
     	shapeColor = color;
   }

   public void paintComponent(Graphics g)
	{
	   	Graphics2D g2 = (Graphics2D) g;

        Rectangle2D.Double Square = new Rectangle2D.Double(x,y,side,side);
        g2.setColor(shapeColor);
        g2.fill(Square);
        g2.draw(Square);
    }

    public double Perimeter()
    {
    	return 4 * side;
    }

    public double Area()
    {
    	return side * side;
    }

    public int numberOfSides()
    {
    	return 4;
    }

    public int numberOfVertices()
    {
    	return 4;
    }

    public int totalAngleSum()
    {
    	return 360;
    }

    public int numDiagonals()
    {
    	return 2;
    }
}
