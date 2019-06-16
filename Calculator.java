import java.util.Scanner;
class Calculator{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the First number:");
		int n1 = s.nextInt();
		System.out.println("Enter the Second number:");
		int n2 = s.nextInt();
		System.out.println("Enter the Operator:");
		char op = s.next().charAt(0);
		
		double result;
		switch(op)
		{
			case '+':
			result = n1 + n2;
			break;
			
			case '-':
			result = n1 - n2;
			break;
			
			case '*':
			result = n1 * n2;
			break;
			
			case '/':
			result = n1 / n2;
			break;
			
			default:
			System.out.println("Invalid Operator selected");
			return;
		}
		System.out.println(n1+" "+op+" "+n2+"="+result);
	}
}