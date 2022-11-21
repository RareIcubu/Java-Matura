package others;
import java.util.*;
import java.io.*;
public class Palindrom {
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
		
		
		for(int i = 0; i < arr.length; i++) 
		{
			int first = arr[i],mirror = 0, a = 0;
			while(arr[i] != 0) 
			{
				a = arr[i] % 10;
				mirror = mirror*10 +a;
				arr[i] /= 10;
			}
			if(first == mirror) 
			{
				System.out.println("Palindrom: "+first);
			}
		}
		
	}
}
