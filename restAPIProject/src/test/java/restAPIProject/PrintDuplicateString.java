package restAPIProject;

public class PrintDuplicateString {
	public static void main(String[] args) {
		String name = "bansalBSN";
		String name1 = name.toLowerCase();
		char[] arr = name1.toCharArray();
		StringBuffer sb = new StringBuffer();
		
		for(int i = 0; i < arr.length; i++)
		{
			
			
			for(int j = i+1; j < arr.length; j++)
			{
				if(arr[i] == arr[j])
				{
					sb.append(arr[i]);
				}
			}
			
		}
		System.out.println("The Duplicate String is:" + sb);
	}
}


