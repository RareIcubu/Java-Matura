package zad_4;
import java.io.*;
import java.util.*;

public class OdbicieBezwględna {

	public static void main(String[] args) throws Exception {
		File file = new File("przyklad.txt");
		Scanner scan = new Scanner(file);
		int[] arr = new int[11];
		int[] abs = new int[11];
		int[] number = new int[11];
		
		for(int i = 0; i < arr.length; i++) 
		{
			arr[i] = scan.nextInt();
		}
		scan.close();
		for(int i = 0; i < arr.length; i++) 
		{
			int a=0,s=0,module,first=arr[i];
			while(arr[i] !=0) 
			{
				a = arr[i]%10;
				s = s*10 + a;
				arr[i] /= 10;
			}
			module = Math.abs(first - s);
			abs[i] = module;
			number[i] = first;
			
		}
		int max = Arrays.stream(abs).max().getAsInt();
		for(int i =0; i < abs.length; i++) 
		{
			if(abs[i] == max) 
			{
				System.out.println("Wartość bezwzględna: "+max+" Liczba: "+number[i]);
			}
		}

	}

}
