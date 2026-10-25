import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
import java.util.*;

public class Circles extends JComponent implements Shapes
{
   private int x = 60;
   private int y = 60;
   private int width = 200;
   private int height = 200;
   private Color shapeColor = Color.black;

    public Circles(Color backColor, Color color)
   {
     	setBackground(backColor);
     	shapeColor = color;
   }

	public void paintComponent(Graphics g)
	{
	   	Graphics2D g2 = (Graphics2D) g;

        Ellipse2D.Double Ellipse = new Ellipse2D.Double(x,y,width,height);
        g2.setColor(shapeColor);
        g2.fill(Ellipse);
        g2.draw(Ellipse);
    }

    public double Perimeter()
    {
    	double diameter = width;

    	return  Math.PI * diameter;
    }

    public double Area()
    {
    	double radius = width / 2.0;

    	return  Math.PI * radius * radius;
    }

    public int numberOfSides()
    {
    	return 0;
    }

    public int numberOfVertices()
    {
    	return 0;
    }

    public int totalAngleSum()
    {
    	return 360;
    }

    public int numDiagonals()
    {
    	return 0;
    }

}
