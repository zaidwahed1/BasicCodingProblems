import java.util.Scanner;

class AreaOfRect{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter Length:");
		int l = s.nextInt();
		
		System.out.println("Enter Width:");
		int b = s.nextInt();
		
		int area = l*b;
		System.out.println("Area is "+area);
		
	}
}