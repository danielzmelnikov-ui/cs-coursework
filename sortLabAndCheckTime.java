/**
 * @(#)SortLab.java
 *
 *
 * @author Daniel Melnikov
 * @version 1.00 2024/4/23
 */
import java.lang.Math;


public class sortLabAndCheckTime 
{

    public static void main(String[] args)
    {
        int[] sizes = {1000, 10000, 100000};
        System.out.println("Size, Bubble (ms), Selection (ms), Insertion (ms), Merge (ms)");

        for(int n : sizes)
        {
            int[] original = new int[n];
            for(int i = 0; i < n; i++)
            {
                original[i] = (int) (Math.random() * 100000);
            }

            int[] a1 = original.clone();
            int[] a2 = original.clone();
            int[] a3 = original.clone();
            int[] a4 = original.clone();

            long t = System.nanoTime();
            bubble(a1);
            double bubbleMs = (System.nanoTime() - t) / 1000000.0;

            t = System.nanoTime();
            selection(a2);
            double selectionMs = (System.nanoTime() - t) / 1000000.0;

            t = System.nanoTime();
            insertion(a3);
            double insertionMs = (System.nanoTime() - t) / 1000000.0;

            t = System.nanoTime();
            mergeSort(a4, 0, a4.length);
            double mergeMs = (System.nanoTime() - t) / 1000000.0;

            if(!isSorted(a1) || !isSorted(a2) || !isSorted(a3) || !isSorted(a4))
            {
                System.out.println("WARNING: a sort produced an unsorted array at size " + n);
            }

            System.out.println(n + ", " + String.format("%.1f, %.1f, %.1f, %.1f", bubbleMs, selectionMs, insertionMs, mergeMs));
        }
    }

    // Confirms an array is in ascending order
    public static boolean isSorted(int[] array)
    {
        for(int i = 1; i < array.length; i++)
        {
            if(array[i - 1] > array[i])
            {
                return false;
            }
        }
        return true;
    }


    public static void bubble(int[] array)
    {
    	int temp = 0;
    	for(int i = array.length; i > 0; i--)
    	{
    		for(int j = 0; j < i - 1; j++)
    		{
    			if(array[j] > array[j + 1])
    			{
    				temp = array[j];
    				array[j] = array[j + 1]; 
    				array[j + 1] = temp;
    			}
    		}
    	}  
    }
    
    
    public static void selection(int[] array)
    {
    	int i, j;
		int min, temp;
		for(i = 0; i < array.length; i++)
		{
			min = i;
			for(j = i + 1; j < array.length; j++)
			{
				if(array[j] < array[min])
				{
					min = j;
				}
			}
			temp = array[i];
			array[i] = array[min];
			array[min] = temp;
		}
	}
	
	
	public static void insertion(int[] array)
	{
		int temp;
		int pos; 
		for(int i = 1; i < array.length; i++)
		{
			temp = array[i];
			pos = i - 1;
			while((pos >= 0) && (temp < array[pos]))
			{
				array[pos + 1] = array[pos];
				pos--; 
			}
			array[pos + 1] = temp;
		}
	}


    public static void mergeSort(int[] data, int first, int n) 
    {
        if(n > 1) 
        {
            int n1 = n / 2;
            int n2 = n - n1;
            mergeSort(data, first, n1);
            mergeSort(data, first + n1, n2);
            merge(data, first, n1, n2);
        }
    }

    private static void merge(int[] data, int first, int n1, int n2) 
    {
        int[] temp = new int[n1 + n2];
        int copied = 0;
        int copied1 = 0;
        int copied2 = 0;
        while((copied1 < n1) && (copied2 < n2)) 
        {
            if (data[first + copied1] < data[first + n1 + copied2]) 
            {
                temp[copied++] = data[first + (copied1++)];
            } 
            else 
            {
                temp[copied++] = data[first + n1 + (copied2++)];
            }
        }
        while(copied1 < n1) 
        {
            temp[copied++] = data[first + (copied1++)];
        }
        while (copied2 < n2)
        {
            temp[copied++] = data[first + n1 + (copied2++)];
        }
        for (int i = 0; i < n1 + n2; i++) 
        {
            data[first + i] = temp[i];
        }
    }
}