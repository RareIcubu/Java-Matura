package test;
import java.util.*;
import java.io.*;

public class odbicie {

	public static void main(String args[]) throws Exception 
	{
		int[] arr = new int[11];
		File file = new File("przyklad.txt");
		Scanner scan = new Scanner(file);
		int a, s = 0;
		for(int i = 0; i < 11; i++) 
		{
			arr[i] = scan.nextInt();
		}
		scan.close();
		for(int number : arr) 
		{
			while(number != 0) {
				a = number % 10;
				s = s * 10 + a;
				number = number/10;
				
			}
			if(s % 17 == 0) 
			{
				System.out.println(s);
			}
			s=0;
		}
		
	}
}
