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
		punnett("IIYY","iiyy", 2);
		
	}
	public static void print2D(int[][] a)
	{
		int intLength = 0;
		
		for (int row = 0; row < a.length; row++)
		{
			for (int column = 0; column < a[row].length; column++)
			{
				System.out.print(a[row][column]+" ");
			}
			System.out.println();
			
		}
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
	public static void punnett(String purebredM, String purebredW, int generation)
	{
		char m1 = purebredM.charAt(0);
		char m2 = purebredM.charAt(1);
		char m3 = purebredM.charAt(2);
		char m4 = purebredM.charAt(3);
		char w1 = purebredW.charAt(0);
		char w2 = purebredW.charAt(1);
		char w3 = purebredW.charAt(2);
		char w4 = purebredW.charAt(3);
		String genp2 = ""+ m1+w1+m3+w3;
		System.out.println(genp2);
		for (int i = 0; i < generation; i++)
		{
			
		}
		for (int i = 0; i < 4; i++)
		{
			
		}
	}
}