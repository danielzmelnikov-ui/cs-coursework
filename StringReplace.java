import javax.swing.JOptionPane;

public class StringReplace
{

	public static String replaceLetterWithX(String str, String c)
	{

		String result="";
		int length = str.length();

		for(int i=0; i < length; i++)
		{
			if(str.substring(i, i+1).equals(c))
			{
				result+="X";
			}
			else
			{
				result+=str.substring(i, i+1);
			}
		}
		return result;
	}

	public static String replaceLetterWithXYZ(String str, String c)
	{

		String result = "";
		int length = str.length();
		int count = 0;

		for(int i = 0; i < length; i++)
		{
			if(str.substring(i, i + 1).equals(c))
			{
				count++;
				if(count % 3 == 1)
				{
					result += "X";
				}
				else if(count % 3 == 2)
				{
					result += "Y";
				}
				else
				{
					result += "Z";
				}
			}
			else
			{
				result += str.substring(i, i + 1);
			}
		}
		return result;
	}

	public static String replaceWordWithLetter(String str, String word, String c)
	{
	    String result = "";
	    int strLen = str.length();
	    int wordLen = word.length();
	    int i = 0;

	    while (i < strLen)
	    {
	        if (i + wordLen <= strLen && str.substring(i, i + wordLen).equals(word))
	        {
	            result += c;
	            i += wordLen;
	        }
	        else
	        {
	            result += str.substring(i, i + 1);
	            i++;
	        }
	    }
	    return result;
}

    public static void main(String args[])
    {
    	String input = JOptionPane.showInputDialog("Enter a big string.");
    	String word = JOptionPane.showInputDialog("Enter a 'word'.");
    	String letter = JOptionPane.showInputDialog("Enter a single letter.");

    	System.out.println("Original string: "+input);
    	System.out.println("Original word: "+word);
   		System.out.println("Original letter: "+letter);
   		System.out.println("\nreplaceLetterWithX method:");
   		System.out.println("  "+replaceLetterWithX(input, letter));
   		System.out.println("\nreplaceLetterWithXYZ method:");
   		System.out.println("  "+replaceLetterWithXYZ(input, letter));
   		System.out.println("\nreplaceWordWithLetter method:");
   		System.out.println("  "+replaceWordWithLetter(input, word, letter));
    }

}
