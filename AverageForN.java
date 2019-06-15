import java.util.Scanner;
class AverageForN{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the total amount of numbers:");
		int n = s.nextInt();
		int list[] = new int[n];
		
		System.out.println("Enter "+n+" numbers");
		for(int i=0;i<n;i++)
		list[i]=s.nextInt();
		
		double sum = 0;
		for(int j=0;j<n;j++)
			sum = sum + list[j];
		System.out.println("Average for the numbers is "+sum/n+".");
	}
}