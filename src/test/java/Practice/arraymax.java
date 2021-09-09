package Practice;

public class arraymax 
{
	
		public static void main(String[] args)
		{
			int a[]= {900,200,400,100,500};
			for(int i=0;i<a.length;i++)
			{
				for(int j=i+1;j<a.length;j++)
				{
					if( a[i]<a[j])
					{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					}
				}
				
			}
			for(int i=0;i<a.length;i++)
			{
				System.out.println("sorted array");
				System.out.print(" "+a[i]);
			}
			    System.out.println();
				System.out.println(" max value"+a[0]);
				System.out.println(" min value" +a[a.length-1]);
				
				
			}
			
		}
	




