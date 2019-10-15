package arraytest;

public class arrayfirst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[]{10,100,50,40,30};
		
		int max = 0,min=a[0];
		 
		for(int i=1;i<a.length;i++)
		{
			System.out.println(a[i]);
			
			if(max<a[i])
			{
				max=a[i];
				
				
				
			}
			if(min>a[i])
			{
				min=a[i];
			}
			
			
			
		}
		System.out.println("maximum value is :"+max);
		System.out.println("minimum value is:"+min);
		
		
		

		
	
	}

}
