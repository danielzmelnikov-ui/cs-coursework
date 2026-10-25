/**
 * Point.java
 * A simple immutable point, included so LinearFunction can run on its own.
 *
 * @author Daniel Melnikov
 */
public class Point
{
	private final double x;
	private final double y;

	public Point(double x, double y)
	{
		this.x = x;
		this.y = y;
	}

	public double xCoord()
	{
		return x;
	}

	public double yCoord()
	{
		return y;
	}
}
