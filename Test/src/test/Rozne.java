package test;
import java.util.*;
import java.io.*;
public class Rozne {

	public static void main(String[] args) throws Exception {
		File file = new File("przyklad.txt");
		Scanner scan = new Scanner(file);
		int[] arr = new int[11];
		int diff = 0, same = 0, same3 = 0;
		boolean same_bool = false;
		
		for(int i = 0; i < arr.length; i++) 
		{
			arr[i] = scan.nextInt();
		}
		scan.close();
		for(int i = 0; i < arr.length; i++) 
		{
			for(int j = i + 1; j < arr.length; j++) 
			{
				if(arr[i] == arr[j] && same_bool == false) 
				{
					same++;
				}
				else if(arr[i] == arr[j] && same_bool) 
				{
					same3++;
					if(same !=0) 
					{
						same--;
					}
				}
			}
			same_bool = false;
		}
		diff = arr.length - same - same3;
		System.out.println("Diff: "+diff+" The Same: "+same+" The Same 3 times: "+ same3);
	}

}
