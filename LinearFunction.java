/**
 * LinearFunction.java
 * Models a linear function of the form y = mx + b.
 *
 * @author Daniel Melnikov
 */
public class LinearFunction
{
	private static final double TOLERANCE = 1e-9;
	private final double slope;
	private final double yInt;

	// Default is y = x
	public LinearFunction()
	{
		slope = 1;
		yInt = 0;
	}

	// m is the slope, y is the y-intercept
	public LinearFunction(double m, double y)
	{
		slope = m;
		yInt = y;
	}

	// m is the slope, p is a point on the line
	public LinearFunction(Point p, double m)
	{
		slope = m;
		yInt = p.yCoord() - m * p.xCoord();
	}

	// p1 and p2 are two points on the line (they must have different x-coordinates)
	public LinearFunction(Point p1, Point p2)
	{
		double x1 = p1.xCoord();
		double y1 = p1.yCoord();
		double x2 = p2.xCoord();
		double y2 = p2.yCoord();

		if (x1 == x2)
		{
			throw new IllegalArgumentException("Points must have different x-coordinates");
		}

		slope = (y1 - y2) / (x1 - x2);
		yInt = y1 - slope * x1;
	}

	public double findSlope()
	{
		return slope;
	}

	public double findYint()
	{
		return yInt;
	}

	// Returns true if p is on this line (compares with a small tolerance for rounding)
	public boolean contains(Point p)
	{
		double expected = slope * p.xCoord() + yInt;
		return Math.abs(expected - p.yCoord()) < TOLERANCE;
	}

	// Returns the x-intercept, or NaN if the line is horizontal
	public double findXint()
	{
		if (slope == 0)
		{
			return Double.NaN;
		}
		return -yInt / slope;
	}

	// Returns the y value of this function at x
	public double evaluateAt(double x)
	{
		return slope * x + yInt;
	}

	// Examples: "y = 2.0x + 7.0", "y = 2.0x - 7.0", "y = x + 7.0",
	// "y = -x + 7.0", "y = 2.0x", "y = 3.0"
	public String toString()
	{
		if (slope == 0)
		{
			return "y = " + yInt;
		}

		String x;
		if (slope == 1)
		{
			x = "x";
		}
		else if (slope == -1)
		{
			x = "-x";
		}
		else
		{
			x = slope + "x";
		}

		if (yInt == 0)
		{
			return "y = " + x;
		}
		else if (yInt > 0)
		{
			return "y = " + x + " + " + yInt;
		}
		else
		{
			return "y = " + x + " - " + Math.abs(yInt);
		}
	}
}
