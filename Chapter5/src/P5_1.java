
public class P5_1 {

	public static void main(String[] args) 
	{
		double small = small(2.0, 2.0, 3.0);
		System.out.println("The smallest value is " + smallest);
		
		double avg = average(9.0, 6.0, 3.0);
		System.out.println("The average value is " + avg);

	}
	
	public static double small(double x, double y, double z) 
	{
		double small = 0;
		//Comparing first two values
		if(x < y)
		{
			small = x;
		}
		else
		{
			small = y;
		}
		
		
		if(z < small)
		{
			small = z;
		}
		
		return small;
	}
	
	public static double average(double x, double y, double z)
	{
		double avg = (x + y + z)/3;
		return avg;
	}

}
