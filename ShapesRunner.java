import javax.swing.JFrame;
import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class ShapesRunner
{
	public static void main(String[] args)
	{

		JFrame shapeFrame = new JFrame();
		shapeFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    	shapeFrame.setTitle("Geometric Shapes");
    	shapeFrame.setSize(800,800);
    	shapeFrame.setLayout(null);

        Circles circle = new Circles(Color.white, Color.blue);
   	    circle.setBounds(0, 0, 800, 800);
   	    shapeFrame.add(circle);
   	    shapeFrame.setVisible(true);

   	    Square square = new Square(Color.white, Color.red);
   	    square.setBounds(0, 0, 800, 800);
   	    shapeFrame.add(square);
   	    shapeFrame.setVisible(true);

   	    Rectangle rectangle = new Rectangle(Color.white, Color.pink);
   	    rectangle.setBounds(0, 0, 800, 800);
   	    shapeFrame.add(rectangle);
   	    shapeFrame.setVisible(true);

   	    Triangle triangle = new Triangle(Color.white, Color.pink);
   	    triangle.setBounds(0, 0, 800, 800);
   	    shapeFrame.add(triangle);
   	    shapeFrame.setVisible(true);

        JOptionPane.showMessageDialog(null, "The perimeter of the circle is : " +circle.Perimeter());
        JOptionPane.showMessageDialog(null, "The Area of the circle is : " +circle.Area());
        JOptionPane.showMessageDialog(null, "The number of sides of the circle is : " +circle.numberOfSides());
        JOptionPane.showMessageDialog(null, "The number of vertices of the circle is : " +circle.numberOfVertices());
		JOptionPane.showMessageDialog(null, "The sum of all angles in a circle are : " +circle.totalAngleSum());
		JOptionPane.showMessageDialog(null, "The total number of diagonals in a circle are : " +circle.numDiagonals());

        JOptionPane.showMessageDialog(null, "Square Perimeter: " + square.Perimeter());
        JOptionPane.showMessageDialog(null, "Square Area: " + square.Area());
        JOptionPane.showMessageDialog(null, "Square Sides: " + square.numberOfSides());
        JOptionPane.showMessageDialog(null, "Square Vertices: " + square.numberOfVertices());
        JOptionPane.showMessageDialog(null, "The sum of all angles in a square are : " +square.totalAngleSum());
		JOptionPane.showMessageDialog(null, "The total number of diagonals in a square are : " +square.numDiagonals());

        JOptionPane.showMessageDialog(null, "Rectangle Perimeter: " + rectangle.Perimeter());
        JOptionPane.showMessageDialog(null, "Rectangle Area: " + rectangle.Area());
        JOptionPane.showMessageDialog(null, "Rectangle Sides: " + rectangle.numberOfSides());
        JOptionPane.showMessageDialog(null, "Rectangle Vertices: " + rectangle.numberOfVertices());
        JOptionPane.showMessageDialog(null, "The sum of all angles in a rectangle are : " +rectangle.totalAngleSum());
		JOptionPane.showMessageDialog(null, "The total number of diagonals in a rectangle are : " +rectangle.numDiagonals());

        JOptionPane.showMessageDialog(null, "Triangle Perimeter: " + triangle.Perimeter());
        JOptionPane.showMessageDialog(null, "Triangle Area: " + triangle.Area());
        JOptionPane.showMessageDialog(null, "Triangle Sides: " + triangle.numberOfSides());
        JOptionPane.showMessageDialog(null, "Triangle Vertices: " + triangle.numberOfVertices());
        JOptionPane.showMessageDialog(null, "The sum of all angles in a triangle are : " +triangle.totalAngleSum());
		JOptionPane.showMessageDialog(null, "The total number of diagonals in a triangle are : " +triangle.numDiagonals());
	}
}
