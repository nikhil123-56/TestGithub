package restAPIProject;

public class CountNoOfConsonants {

	public static void main(String[] args) {
		String y ="NIKHIL";
		String x= y.toLowerCase();
		int count = 0;
		for (int i = 0; i < x.length(); i++)
		{
        	if(x.charAt(i) != 'a' 
        	   && x.charAt(i) != 'e' 
               && x.charAt(i) != 'i' 
        	   && x.charAt(i) != 'o'
        	   && x.charAt(i) != 'u'
        	  )
        		
        	    {
        		  count++;
        	    }
		}
		System.out.println(count);

	}

}
