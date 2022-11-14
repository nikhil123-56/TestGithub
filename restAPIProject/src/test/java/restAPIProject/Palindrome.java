package restAPIProject;

public class Palindrome {

	public static void main(String[] args) {
		String x = "2552";
		String y = "";
		char [] arr = x.toCharArray();
		for(int i = arr.length-1; i >= 0; i--)
		{
			y = y+arr[i];
		}
		if(x.equals(y))
		{
			System.out.println("Given String is palindrome");
		}
		else
			System.out.println("Given String is not palindrome");
	}
}
