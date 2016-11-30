public class lists
{
	/**
	*Main method
	*@param String[] args
	*/
	public static void main(String[] args)
	{
		print2D(createArrArr(34));
	}
	/**
	*Method that prints out a 2D array
	*@param int[][] a that represents the 2D array to be printed out in fancy, organized matter
	*/
	public static void print2D(int[][] a)
	{
		int longestLength = a[a.length-1][a.length-1];
		int numberOfInts = 0;
		int counter = 1;
		int difference = 0;
		String line = "";
		while (longestLength >= 10)
		{
			longestLength = longestLength/10;
			counter++;
		}
		for (int i = 0; i <= a.length*(counter) + a.length;i++)
			line = line + "-";
		System.out.println(line);
		
		for (int row = 0; row < a.length; row++)
		{
			System.out.print("|");
			for (int column = 0; column < a[row].length; column++)
			{
				//System.out.print(lengthFinder(a[row][column]) + " ");
				//System.out.print(longestLength);
				if (lengthFinder(a[row][column])<counter)
				{
					System.out.print(a[row][column]);
					while (difference < counter - lengthFinder(a[row][column]))
					{
						System.out.print(" ");
						difference++;
					}
					difference = 0;
					System.out.print("|");
				}
				else
					System.out.print(a[row][column]+"|");
			}
			System.out.println("");
			System.out.println(line);
		}
	}
	/**
	*Counts how many place values are in the number
	*@param int n a number 
	*@return int counter that represents how many place values the number has
	*/
	public static int lengthFinder(int n)
	{
		int counter = 1;
		while (n >= 10)
		{
			n = n/10;
			counter++;
		}
		return counter;
	}
	//If it has the same name, its overloaded.
	/**
	*Prints out a 2D array. 
	*@param String[][] a array to be printed
	*/
	public static void print2D(String[][] a)
	{
		for (int row = 0; row < a.length; row++)
		{
			for (int column = 0; column < a[row].length; column++)
			{
				System.out.print(a[row][column]+ " ");
			}
			System.out.println();
			
		}
	}
	/**
	*Creates a 2D int array. 
	*@return int[][] pirate a 2D array 
	*/
	public static int[][] createArrArr()
	{
		int[][] pirate = createArrArr(4);
		return pirate;
	}
	/**
	*Creates a 2D int array. 
	*@param int n number of rows and columns in the array
	*@return int[][] pirate a 2D array
	*/
	public static int[][] createArrArr(int n)
	{
		int[][] pirate = new int[n][n];
		int counter = 1;
		for (int row = 0; row < pirate.length; row++)
		{
			for (int col = 0; col < pirate[row].length; col++)
			{
				pirate[row][col] = counter;
				counter++;
			}	
		}
		return pirate;
	}
}