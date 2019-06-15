import java.util.Scanner;
class CalcDiscount{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter The Full Price:");
		int p = s.nextInt();
		System.out.println("Enter The Discount:");
		int d = s.nextInt();
		int d2 = 100 - d;
		double p2 = (p*d2)/100;
		System.out.println("Discounted Price is: "+p2+".");
		
		
	}
}