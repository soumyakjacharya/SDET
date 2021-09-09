package Practice;

public class Stringarray
{
	public static void main(String[] args)
	{
		String s[]= {"hi","hello","to","by","banglore","city"};
		String min=s[0];
		for(int i=0;i<s.length;i++)
		{
			if(min.length()>s[i].length())
			{
				min=s[i];
			}
			else
				if(min.length()==s[i].length())
				System.out.println("minium String length is=  " +s[i]);	
		}
		
		
	}
	
}

