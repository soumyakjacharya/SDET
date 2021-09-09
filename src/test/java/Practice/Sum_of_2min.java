package Practice;

public class Sum_of_2min {
	
		public static void main(String[] args) {

			 int a[]= {10,60,30,20,50};
			 for(int i=0;i<a.length;i++)
				 {
					 for(int j=i+1;j<a.length;j++)
					 {
						 if(a[i]>a[j])
						 {
							 int temp=a[i];
							 a[i]=a[j];
							 a[j]=temp;
							
						 }
					 }
				 }
		
			 int sum=0;
			 for(int i=0;i<2;i++)
			 {
				 sum=sum+a[i];
				
			 }
			
			 System.out.println( "sum of two min. no.");
			 System.out.println("sum = " +sum);
		
		}

	}
