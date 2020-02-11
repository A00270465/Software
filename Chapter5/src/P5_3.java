
public class P5_3 {

	public static void main(String[] args) 
	{
		
		int firstDigit = firstDigit(29567);
		System.out.println("First digit is " + firstDigit);
		
		int lastDigit = lastDigit(295609);
		System.out.println("last digit is " + lastDigit);
		
		System.out.println("Amount of digits in number is " + digits(24609));
	}
	
	public static int firstDigit(int n)
	{
		int firstDigit = 0;
		
		//Converting int to String
		String number = "" + n;
		
		//Getting first substring
		String temp = number.substring(0, 1);
		
		//Converting string to int
		firstDigit = Integer.parseInt(temp);
				
		return firstDigit;
	}
	
	public static int lastDigit(int n)
	{
		int lastDigit = 0;
		
		//Converting int to String
		String number = "" + n;
				
		//Getting first substring
		String temp = number.substring(number.length()-1);
				
		//Converting string to int
		lastDigit = Integer.parseInt(temp);
		
		
		return lastDigit;
	}
	
	public static int digits(int n)
	{
		int amountOfDigits = 0;
		
		//Converting int to string
		String temp = n + "";
		
		//The length of string is the amount of digits in string
		amountOfDigits = temp.length();
		
		return amountOfDigits;
	}

}
