import java.util.Scanner;

class Factorial
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter number to calculate Factorial");
		int n = s.nextInt();
		
		int fact=1;
		
		System.out.println("Factorial is");
		if(n<=1)
			System.out.println("1");
		else
		{
			for(int i=1;i<=n;i++)
			{
				fact=fact*i;
			}
			System.out.println(+fact);
		}
	}
}