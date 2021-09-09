package Practice;

public class Array_max_length {
	
	public static void main(String[] args)
		{
			String s[]= {"hi","hello","bye","banglore","city"};
			String max=s[3];
			for(int i=0;i<s.length;i++)
			{
				if((max.length())<(s[i].length()))
				{
					max=s[i];
				}
			}
			for(int i=0;i<s.length;i++)
	        System.out.print(" "+s[i]);
			System.out.println();
			System.out.println(" maximun String length is=  " +max);
		}
		
	}



