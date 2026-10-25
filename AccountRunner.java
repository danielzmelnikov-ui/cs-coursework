/**
 * @(#)AccountRunner.java
 *
 *
 * @author Daniel Melnikov
 * @version 1.00 2024/1/17
 */
import javax.swing.JOptionPane;

public class AccountRunner
{
	public static void displayAccount(Accounts account)
	{
		System.out.println(account.getName() + "\n" + account.getPhoneNumber() + "\n" + account.getBalance());
	}

    public static void multipleAccounts()
	{
		Accounts[] arrayAccounts = new Accounts[6];

        for (int i = 0; i < arrayAccounts.length; i++)
        {
            String nameInput = JOptionPane.showInputDialog("Enter a name for new contact number " + (i + 1));
            String numInput = JOptionPane.showInputDialog("Enter a phone number for new contact number " + (i + 1));
            String balanceInput = JOptionPane.showInputDialog("Enter a balance for new contact number " + (i + 1));

            double balance = Double.parseDouble(balanceInput);

            arrayAccounts[i] = new Accounts(nameInput, numInput, balance);
        }
        for (int i = 0; i < arrayAccounts.length; i++)
        {
            displayAccount(arrayAccounts[i]);
        }
	}

    public static void main(String[] args)
    {
    	Accounts newAccount = new Accounts("Sample Person", "1234567890", 0.25);
    	displayAccount(newAccount);
    	Accounts plainAccount = new Accounts();
    	plainAccount.changeName("Sample User");
    	plainAccount.changePhoneNumber("0987654321");
    	plainAccount.changeBalance(100);
    	displayAccount(plainAccount);
    	multipleAccounts();
    }
}