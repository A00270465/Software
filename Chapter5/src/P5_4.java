
public class P5_4 {

	public static void main(String[] args) 
	{
		System.out.println("The middle of the word is - " + middle("helolghh"));

	}
	
	public static String middle(String str)
	{
		String mid = "";
		
		//First finding the length of string
		int length = str.length();
		
		//Checking if it even or odd
		if(length % 2 == 0) // even
		{
			mid = str.substring((length/2-1), (length/2+1));
		}
		//odd
		else				
		{
			mid = str.substring(length/2, length/2+1);
		}
		
		return mid;
	}

}
