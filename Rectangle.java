import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
import java.util.*;

public class Rectangle extends JComponent implements Shapes
{
   private int x = 60;
   private int y = 400;
   private int length = 300;
   private int height = 200;
   private Color shapeColor = Color.black;

   public Rectangle(Color backColor, Color color)
   {
     	setBackground(backColor);
     	shapeColor = color;
   }

   public void paintComponent(Graphics g)
	{
	   	Graphics2D g2 = (Graphics2D) g;

        Rectangle2D.Double rectangle = new Rectangle2D.Double(x,y,length,height);
        g2.setColor(shapeColor);
        g2.fill(rectangle);
        g2.draw(rectangle);
    }

    public double Perimeter()
    {
    	return (2 * height) + (2 * length);
    }

    public double Area()
    {
    	return height * length;
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
