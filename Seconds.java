import java.util.Scanner;
class Seconds{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the Seconds:");
		int sec = s.nextInt();
		int h = sec/3600;
		sec = sec%3600;
		int m = sec/60;
		sec = sec%60;
		System.out.println("That to hours is"+h+":"+m+":"+sec);
	}
}