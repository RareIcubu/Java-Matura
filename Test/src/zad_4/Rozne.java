package zad_4;
import java.util.*;
import java.io.*;
public class Rozne {

	public static void main(String[] args) throws Exception {
		File file = new File("liczby.txt");
		Scanner scan = new Scanner(file);
		int[] arr = new int[100];
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
				System.out.println("i: "+arr[i]+" j: "+arr[j]);
				if(arr[i] == arr[j] && same_bool == false) 
				{
					same++;
					same_bool = true;
				}
				else if(arr[i] == arr[j] && same_bool) 
				{
					System.out.println(arr[j]);
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
