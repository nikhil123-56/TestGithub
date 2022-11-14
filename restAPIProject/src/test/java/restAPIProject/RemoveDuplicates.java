package restAPIProject;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String name = "NikhiNl";
		char[] arr = name.toCharArray();
		StringBuffer sb = new StringBuffer();
		
		for(int i = 0; i < arr.length; i++)
		{
			boolean repeated = false;
			
			for(int j = i+1; j < arr.length; j++)
			{
				if(arr[i] == arr[j])
				{
					repeated = true;
					break;
				}
			}
			if(!repeated)
			{
				sb.append(arr[i]);
			}
		}
		System.out.println(sb);
	}
}
