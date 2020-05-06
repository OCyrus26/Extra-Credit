import java.util.*;

public class Quiz1 
{

	public static void main(String[] args)
	{
		Scanner scan = new Scanner (System.in);
		
		int int1;
		int int2;
		double sum;
		double difference;
		double product;
		float average;
		
		System.out.println("Enter two integers: ");
		
		int1 = scan.nextInt();
		int2 = scan.nextInt();
		
		sum = int1 + int2;
		difference = int1 - int2;
		product = int1 * int2;
		average = ((int1 + int2) / 2);
				
		System.out.println("The sum of the integers is: "+sum);	
		System.out.println("The difference of the integers is: "+difference);	
		System.out.println("The product of the integers is: "+product);	
		System.out.println("The average of the integers is: "+average);	

	}

}
