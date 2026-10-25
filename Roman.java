/**
 * Roman.java
 * Converts an integer from 1 to 3999 into a Roman numeral.
 *
 * @author Daniel Melnikov
 */
import javax.swing.JOptionPane;

public class Roman
{
    public static String toRoman(int number)
    {
        String result = "";

        String[] romans = {"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};
        int[] values = {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};

        // Work from the largest value down, subtracting as many of each as fit
        for (int i = romans.length - 1; i >= 0; i--)
        {
            while (number >= values[i])
            {
                result += romans[i];
                number -= values[i];
            }
        }
        return result;
    }

    public static void main(String[] args)
    {
        String input = JOptionPane.showInputDialog("Enter a number 1-3999");
        int number = Integer.parseInt(input);

        if (number < 1 || number > 3999)
        {
            System.out.println("Please enter a number from 1 to 3999.");
        }
        else
        {
            System.out.println(toRoman(number));
        }
    }
}
