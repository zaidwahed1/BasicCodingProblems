import java.util.Scanner;
class Power{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the number");
		int n = s.nextInt();
		System.out.println("Enter the power");
		int p = s.nextInt();
		
		int a = 1;
		for(int i=0;i<p;i++)
			a=n*a;
		System.out.println(n+"^"+p+" is "+a+".");
	}
}