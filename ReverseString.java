import java.util.Scanner;

class ReverseString{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the string to be reversed");
		String str = s.nextLine();
		char[] ch=str.toCharArray();
		System.out.println("Reverse of a String is :"); 
		for(int i=ch.length;i>0;i--)
		{
		System.out.print(ch[i-1]); 
		}
	}	
}