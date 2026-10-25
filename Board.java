import java.lang.Math;

public class Board
{

	int[][] game;

    public Board(int rows, int columns)
    {
		game = new int[rows][columns];
    }

    public boolean takeATurn(int player, int column)
    {
		column--;
	    for(int i = game.length - 1; i >= 0; i--)
	    {
	        if(game[i][column] == 0)
	        {
	            game[i][column] = player;
	            return true;
	        }
	    }
	    return false;
    }

    public boolean isWin(int player)
    {
		for(int row = 0; row < game.length; row++)
		{
	        for(int col = 0; col <= game[row].length - 4; col++)
	        {
	            if(game[row][col] == player &&
	            	game[row][col + 1] == player &&
	                game[row][col + 2] == player &&
	                game[row][col + 3] == player)
	                {
		                return true;
		            }
	        }
	    }

	    for(int col = 0; col < game[0].length; col++)
	    {
	        for(int row = 0; row <= game.length - 4; row++)
	        {
	            if(game[row][col] == player &&
	                game[row + 1][col] == player &&
	                game[row + 2][col] == player &&
	                game[row + 3][col] == player)
	               	{
		                return true;
		            }
	        }
	    }

	    for(int row = 0; row <= game.length - 4; row++)
	    {
	        for(int col = 0; col <= game[row].length - 4; col++)
	        {
	            if(game[row][col] == player &&
	                game[row + 1][col + 1] == player &&
	                game[row + 2][col + 2] == player &&
	                game[row + 3][col + 3] == player)
	                {
		                return true;
		            }
	        }
	    }

	    for(int row = 3; row < game.length; row++)
	    {
	        for(int col = 0; col <= game[row].length - 4; col++)
	        {
	            if(game[row][col] == player &&
	                game[row - 1][col + 1] == player &&
	                game[row - 2][col + 2] == player &&
	                game[row - 3][col + 3] == player)
	                {
		                return true;
		            }
	        }
	    }
	    return false;
    }

	public boolean isFull()
	{
		for(int i = 0; i < game.length; i++)
		{
			for(int j = 0; j < game[i].length; j++)
			{
				if(game[i][j] == 0)
				{
					return false;
				}
			}
		}
		return true;
	}

    public String toString()
    {
    	String output = "";
	    for (int i = 0; i < game.length; i++)
	    {
	        for (int j = 0; j < game[i].length; j++)
	        {
	            output += game[i][j] + " ";
	        }
	        output += "\n";
	    }
	    return output;
    }

    public int computerTurn(int player)
    {
	    if(isFull())
	    {
	        return -1;
	    }
	    int column = (int)(Math.random() * game[0].length) + 1;
	    while(game[0][column - 1] != 0)
	    {
	        column = (int)(Math.random() * game[0].length) + 1;
	    }
	    int row = game.length - 1;
	    while(game[row][column - 1] != 0)
	    {
	        row--;
	    }
	    game[row][column - 1] = player;
	    return column;
	}
}
