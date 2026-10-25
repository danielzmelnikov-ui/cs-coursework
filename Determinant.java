/**
 * Determinant.java  3/3/2015
 *
 * @author Daniel Melnikov
 *
 *
 */

import javax.swing.JOptionPane;

public class Determinant
{
    public static void main(String args[])
    {
    	String sizeStr = JOptionPane.showInputDialog("What size?");
    	int size = Integer.parseInt(sizeStr);
    	int[][] matrix = new int[size][size];
    	for(int i=0; i<size; i++)
    		for(int j=0; j<size; j++)
    			matrix[i][j] = (int)(Math.random()*40)-20;

    	printArray(matrix);
    	System.out.println("\nThe determinant = "+det(matrix));

    }


   
    public static int det(int[][] A)
    {
    	int determinant = 0;
    	if(A.length == 1)
    	{
    		return A[0][0];
    	}
    	else if(A.length == 2)
    	{
    		return (A[0][0]*A[1][1]) - (A[0][1]*A[1][0]);
    	}
    	else
    	{
    		for(int i = 0; i < A.length; i++)
            {
                determinant += Math.pow(-1, i) * A[0][i] * det(Copy(A, i));
            }
    	}
    	return determinant;
    	
    }



	public static int[][] Copy(int[][] B, int i)
	{
		int[][] copy = new int[B.length - 1][B.length - 1];
        for (int row = 1; row < B.length; row++)
        {
            int colCount = 0;
            for (int col = 0; col < B.length; col++)
            {
                if (col != i)
                {
                    copy[row - 1][colCount] = B[row][col];
                    colCount++;
                }
            }
        }
        return copy;
	}


    public static void printArray(int[][] A)
    {
    	for(int i=0; i<A.length; i++)
    	{
    		for(int j=0; j<A.length; j++)
    		{
    			int num = A[i][j];
    			if(num<-9)
    				System.out.print(" ");
    			else if(num<0||num>9)
    				System.out.print("  ");
    			else
    				System.out.print("   ");
				System.out.print(A[i][j]);
    		}
    		System.out.println();
    	}
    }


}