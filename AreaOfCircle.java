import java.util.Scanner;			//Command to import the scanner class for taking in input
class AreaOfCircle 					//Name of your class 
{
   public static void main(String args[]) //declaration of main class
    {          
      Scanner s= new Scanner(System.in);	//Declaring scanner variable for taking in input
         System.out.println("Enter the radius:");	//Getting values from user
         double r= s.nextDouble();					//Declared as double, so that decimals are also included
         double  area=(22*r*r)/7 ;					//Declared as double, so that decimal values are not rounded.
         System.out.println("Area of Circle is: " + area);      //Display the area
   }
}