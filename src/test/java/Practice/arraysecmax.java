package Practice;

public class arraysecmax {
 public static void main(String[] args)
 {
	 int a[]= {10,60,30,20,50};
	 for(int i=0;i<a.length;i++)
		 {
			 for(int j=i+1;j<a.length;j++)
			 {
				 if(a[i]<a[j])
				 {
					 int temp=a[i];
					 a[i]=a[j];
					 a[j]=temp;
					
				 }
			 }
		 }
	 System.out.println( "Array elements in descending order");
	 for(int i=0;i<a.length;i++)
	 {

	  System.out.print(" "+a[i]);
	 
	 }
	 System.out.println();
	 System.out.println( "second max value in array " +a[1]);
	 System.out.println( "second min value in array "  +a[a.length-2]);
 }
}
 
