package masai;

public class prime {
	
	
	static void prime_w(int n)
	{
		if(n<2 || n>100)
		{
			System.out.println("Invalid number");
		}
		else
		{
			for(int i=1; i<=n; i++)
			{
				if(n%i==0)
				{
					System.out.print(i+", ");
				}
			}
		}
		
	}
	
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         prime_w(12);
	}

}
