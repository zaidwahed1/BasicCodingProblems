import java.util.Scanner;
class Fibonacci
{
	public static void main(String[] args)
	{
	Scanner s =new Scanner(System.in);
	
	System.out.print("Enter number of terms: ");
	int n = s.nextInt();
	
	System.out.println("The FIbanacci series is:");
	int i = 0,j=1,nextTerm;
	for(int k=0;k<n;k++)
	{
		if(k<=1)
			nextTerm=k;
		else
		{
			nextTerm=i+j;
			i=j;
			j=nextTerm;
		}
		System.out.println(nextTerm);
	}
	
	}
}