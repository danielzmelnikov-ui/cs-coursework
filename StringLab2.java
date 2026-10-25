import javax.swing.JOptionPane;

public class StringLab2
{

	public static String reverse(String str)
	{

		String result="";

		for (int i = str.length() - 1; i >= 0; i--)
		{
        	result += str.substring(i, i + 1);
    	}
		return result;
	}

   	public static int howManyWithOverlap(String str, String word)
	{

		if (word.length() == 0)
		{
			return 0;
		}
		int count = 0;
		int strLen = str.length();
    	int wordLen = word.length();

    	for (int i = 0; i <= strLen - wordLen; i++)
    	{
        	if (str.substring(i, i + wordLen).equals(word))
        	{
            count++;
        	}
    	}
		return count;
	}

	public static int howManyWithoutOverlap(String str, String word)
	{

		if (word.length() == 0)
		{
			return 0;
		}
		int count = 0;
		int strLen = str.length();
	    int wordLen = word.length();
	    int i = 0;

	    while (i < strLen - wordLen + 1)
	    {
	        if (str.substring(i, i + wordLen).equals(word))
	        {
	            count++;
	            i += wordLen;
	        }
	        else
	        {
	            i++;
	        }
	    }
		return count;
	}

    public static void main(String args[])
    {
    	String input = JOptionPane.showInputDialog("Enter a string.");
    	String word = JOptionPane.showInputDialog("Enter a 'word'.");

    	System.out.println("Original string: "+input);
   		System.out.println("Original word: "+word);
   		System.out.println("\nreverse method:");
   		System.out.println("  "+reverse(input));
   		System.out.println("\nhowManyWithOverlap method:");
   		System.out.println("  "+howManyWithOverlap(input,word));
   		System.out.println("\nhowManyWithoutOverlap method:");
   		System.out.println("  "+howManyWithoutOverlap(input, word));
    }

}
