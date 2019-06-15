import java.util.Scanner;
class AreaOfTriangle{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter Height:");
		int h = s.nextInt();
		
		System.out.println("Enter Base:");
		int b = s.nextInt();
		
		float area = (h*b)/2;
		System.out.println("Area is "+area);
	}
}