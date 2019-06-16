import java.util.Scanner;
class MultiplicationTable{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the number:");
		int n = s.nextInt();
		int res = n;
		for(int i=1;i<=10;i++){
			res=n*i;
			System.out.println(n+" x "+i+" = "+res);
		}
	}
}