import java.util.Scanner;
class SumOfIntegers{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter any integer:");
		int n = s.nextInt();
		int sum = 0;
		while(n!=0){
			sum +=n%10;
			n=n/10;
		}
		System.out.println("Sum of the digits is: "+sum);
	}
}