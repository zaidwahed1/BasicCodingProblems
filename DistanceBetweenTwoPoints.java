import java.util.Scanner;
class DistanceBetweenTwoPoints{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the x1 point");
		int x1 = s.nextInt();
		System.out.println("Enter the y1 point");
		int y1 = s.nextInt();
		System.out.println("Enter the x2 point");
		int x2 = s.nextInt();
		System.out.println("Enter the y2 point");
		int y2 = s.nextInt();
		
		double dis = Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
		System.out.println("Distance is "+dis);
	}
}