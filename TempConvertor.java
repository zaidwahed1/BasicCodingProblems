import java.util.Scanner;
class TempConvertor{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		
		int c,f;
		System.out.println("Choose to convert:");
		System.out.println("1. Celsius to Farhenhiet:");
		System.out.println("2. Farhenhiet to Celsius");
		int ch = s.nextInt();
		
		switch(ch){
			case 1:
			System.out.println("Enter Celsius Value:");
			c = s.nextInt();
			f = ((c*9)/5)+32;
			System.out.println("Farhenhiet Value:"+f);
			break;
			case 2:
			System.out.println("Enter Farhenhiet Value:");
			f = s.nextInt();
			c = ((f-32)*5)/9;
			System.out.println("Celsius Value:"+c);
			break;
			default:
			System.out.println("Invalid Selection");
			return;
		}
		
	}
}