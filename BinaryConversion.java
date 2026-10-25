/**
 * BinaryConversion.java
 * Converts decimal to binary, negative decimal to two's complement, and binary to decimal.
 *
 * @author Daniel Melnikov
 */
import java.lang.Math;
import javax.swing.JOptionPane;

public class BinaryConversion
{
    public static int[] toBinary(int n)
    {

        int[] b = new int [32];
        int i = b.length - 1;
        while(n != 0)
        {
            b[i] = n % 2;
            n = n / 2;
            i--;
        }
        return b;
    }

    public static int[] twoComplement(int n)
    {
        int y = -n;
        int[] z = toBinary(y);
        for(int i = 0; i < z.length; i++)
        {
            if(z[i] == 1)
            {
                z[i] = 0;
            }
            else
            {
                z[i] = 1;
            }
        }
        // add 1 to the flipped bits: carry through 1s until a 0 is found
        for(int x = z.length - 1; x >= 0; x--)
        {
            if(z[x] == 0)
            {
                z[x] = 1;
                break;
            }
            z[x] = 0;
        }
        return z;
    }

    public static int toDecimal(String bin)
    {
        int sum = 0;
        int pow = 0;
        for(int i = bin.length() - 1; i >= 0; i--)
        {
            int x = Integer.parseInt(bin.substring(i, i + 1));
            sum = sum + (int)(x * Math.pow(2,pow));
            pow++;  
        }
        return sum;
    }

    public static void main(String[] args)
    {
        String str = JOptionPane.showInputDialog("Enter a positive number in decimal form");
        int x = Integer.parseInt(str);
        int[] bin = toBinary(x);
        for(int i = 0; i < bin.length; i++)
        {
            System.out.print(bin[i]);
        }   
        System.out.println();

        String str2 = JOptionPane.showInputDialog("Enter a negative number in decimal form");
        int z = Integer.parseInt(str2);
        int[] bin2 = twoComplement(z);
        for(int i = 0; i < bin2.length; i++)
        {
            System.out.print(bin2[i]);
        }
        System.out.println();   

        String y = JOptionPane.showInputDialog("Enter a number in binary form");
        int a = toDecimal(y);
        System.out.print(a);
        System.out.println();
    }
}