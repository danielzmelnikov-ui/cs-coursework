/**
 * @(#)IntroToRecursion.java
 *
 *
 * @author Daniel Melnikov
 * @version 1.00 2024/3/31
 */
import javax.swing.JOptionPane;

public class IntroToRecursion 
{
    public static void main(String[] args) 
    {
    	int n = Integer.parseInt(JOptionPane.showInputDialog("Enter an integer to be multiplied by 5"));
    	int result1 = FiveTimes(n);
    	System.out.println(result1);
    	
    	int x = Integer.parseInt(JOptionPane.showInputDialog("Enter an X integer to be multiplied"));
    	int y = Integer.parseInt(JOptionPane.showInputDialog("Enter an Y integer to be multiplied"));
    	int result2 = Multiplication(x, y);
    	System.out.println(result2);
    	
    	int input = Integer.parseInt(JOptionPane.showInputDialog("Enter a decimal number to convert to binary"));
        ConvertToBin(input);
    }
    
    public static void ConvertToBin(int decimalNum)
    {
    	int quotient = decimalNum / 2;
        int remainder = decimalNum % 2;
        if (quotient > 0) 
        {
            ConvertToBin(quotient); 
        }
        System.out.print(remainder);
    } 
    	
    public static int FiveTimes(int n)
    {
        if (n == 0)
        {
            return 0;
        }
        if (n < 0)
        {
            return -FiveTimes(-n);
        }
        return 5 + FiveTimes(n - 1);
    }
    
    public static int Multiplication(int x, int y) 
    {
	    if (x == 0 || y == 0) 
	    {
	        return 0;
	    }
	    
	    if (x < 0 && y < 0) 
	    {
	        return Multiplication(-x, -y);
	    }
	    
	    if (x < 0)
	    {
	        return -Multiplication(-x, y);
	    }
	    if (y < 0) 
	    {
	        return -Multiplication(x, -y);
	    }
	    return x + Multiplication(x, y - 1);
	}
}