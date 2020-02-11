
public class P5_2 {

	public static void main(String[] args)
	{
		boolean ifTheSame = allTheSame(6.0, 5.0, 5.0);
		System.out.println("Are numbers the same? " + (ifTheSame ? "Yes" "No"));
		
		boolean ifdifferent = allDifferent(5.0, 5.0, 5.0);
		System.out.println("Are numbers all different? " + (ifdifferent ? "Yes" "No"));
		
		boolean ifsorted = sorted(6.0, 4.0, 7.0);
		System.out.println("Are numbers sorted in ascending order? " + (ifsorted ? "Yes" "No"));
		

	}
	
	public static boolean allTheSame(double x, double y, double z)
	{
		boolean ifTheSame = false;
		
		if(x == y && y == z && z == x)
		{
			ifTheSame = true;
		}
		
		return ifTheSame;
	}

	public static boolean allDifferent(double x, double y, double z)
	{
		boolean ifAllDifferent = false;
		
		if(x != y && y != z && z != x)
		{
			ifAllDifferent = true;
		}
		
		return ifAllDifferent;
	}
	
	public static boolean sorted(double x, double y, double z)
	{
		boolean ifSorted = false;
		
		if(x <= y)
		{
			if (y <= z)
			{
				ifSorted = true;
			}
		}
		
		return ifSorted;
	}
}
