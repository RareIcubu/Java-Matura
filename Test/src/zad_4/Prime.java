package zad_4;
import java.util.*;
import java.io.*;
public class Prime 
{
	static int[] primearr = new int[11];
	public static void main(String args[]) throws Exception 
	{
		int[] arr = new int[11];
		File file = new File("przyklad.txt");
		Scanner scan = new Scanner(file);
		
		for(int i = 0; i < arr.length; i++) 
		{
			arr[i] = scan.nextInt();
		}
		scan.close();
		
		mirror(arr);
		
	}
	
	public static void mirror(int[] numbers) 
	{
		
		for(int i = 0; i < numbers.length; i++) 
		{
			if(prime(numbers[i])) 
			{
				int mirror = 0, a, first = numbers[i];
				while(numbers[i] !=0) 
				{
					a = numbers[i] % 10;
					mirror = mirror*10 + a;
					numbers[i] /= 10; 
				}
				if(prime(mirror)) 
				{
					System.out.println(first);
				}
			}
		}
	}
	
	public static boolean prime(int number)
	{
		if(number < 2) 
		{
			return false;
		}
		for(int i = 2; i <= number/2; i++) 
		{
			if(number % i == 0) 
			{
				return false;
				
			}
		}
		
		return true;
	}

}
