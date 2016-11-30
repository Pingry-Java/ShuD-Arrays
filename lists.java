public class lists
{
	public static void main(String[] args)
	{
		int[] ns = new int[6];
		//int[][] grid = new int[3][4]; // makes a 2d grid thats 3 by 4
		int[][] grid = {{1,2,3},{4,5,6},{7,8,9}};
		print2D(grid);
		int[][] spreadsheet = new int[5][7];
		print2D(spreadsheet);
		String[][] myWords = new String[4][3];
		System.out.println(myWords); //gives memory location
		print2D(myWords);
		print2D(createArrArr());
		print2D(createArrArr(6));
		
	}
	public static void print2D(int[][] a)
	{
		int longestLength = a.length*a[0].length;
		int numberOfInts = 0;
		int counter = 1;
		String line = "";
		while (longestLength > 1)
		{
			longestLength = longestLength/10;
			counter++;
		}
		for (int i = 0; i <= a.length*(counter-1) + a.length+1;i++)
			line = line + "-";
		System.out.println(line);
		for (int row = 0; row < a.length; row++)
		{
			System.out.print("|");
			for (int column = 0; column < a[row].length; column++)
			{
				if (lengthFinder(a[row][column])<counter)
					System.out.print(a[row][column]+" |");
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
		while (n >= 1)
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