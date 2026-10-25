import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
import java.util.*;

public class Triangle extends JComponent implements Shapes
{
    private int[] xPoints = {650, 750, 750};
    private int[] yPoints = {60, 160, 60};
    private Color shapeColor = Color.black;

    public Triangle(Color backColor, Color color)
    {
        setBackground(backColor);
        shapeColor = color;
    }

    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        Polygon triangle = new Polygon(xPoints, yPoints, 3);
        g2.setColor(shapeColor);
        g2.fill(triangle);
        g2.draw(triangle);
    }

    public double Perimeter()
    {
        double side1 = Math.sqrt(Math.pow(xPoints[1] - xPoints[0], 2) + Math.pow(yPoints[1] - yPoints[0], 2));
        double side2 = Math.sqrt(Math.pow(xPoints[2] - xPoints[1], 2) + Math.pow(yPoints[2] - yPoints[1], 2));
        double side3 = Math.sqrt(Math.pow(xPoints[2] - xPoints[0], 2) + Math.pow(yPoints[2] - yPoints[0], 2));
        return side1 + side2 + side3;
    }

    public double Area()
    {
        double a = Math.sqrt(Math.pow(xPoints[1] - xPoints[0], 2) + Math.pow(yPoints[1] - yPoints[0], 2));
        double b = Math.sqrt(Math.pow(xPoints[2] - xPoints[1], 2) + Math.pow(yPoints[2] - yPoints[1], 2));
        double c = Math.sqrt(Math.pow(xPoints[2] - xPoints[0], 2) + Math.pow(yPoints[2] - yPoints[0], 2));
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    public int numberOfSides()
    {
        return 3;
    }

    public int numberOfVertices()
    {
        return 3;
    }

    public int totalAngleSum()
    {
    	return 180;
    }

    public int numDiagonals()
    {
    	return 0;
    }
}
