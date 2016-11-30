public class lists
{
	public static void main(String[] args)
	{
		print2D(createArrArr(34));
		
	}
	public static void print2D(int[][] a)
	{
		int longestLength = a[a.length-1][a.length-1];
		System.out.println(a[a.length-1][a.length-1]);
		int numberOfInts = 0;
		int counter = 1;
		int difference = 0;
		String line = "";
		System.out.println(lengthFinder(a[0][0]));
		while (longestLength >= 10)
		{
			longestLength = longestLength/10;
			counter++;
		}
		System.out.println(counter);
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
	//TODO - Make it print everything nice
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
	public static int[][] createArrArr()
	{
		int[][] pirate = createArrArr(4);
		return pirate;
	}
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