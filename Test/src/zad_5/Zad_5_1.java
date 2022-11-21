package zad_5;
import java.util.*;
import java.io.*;
public class Zad_5_1 {

	public static void main(String[] args) throws Exception {
		String[] arr = new String[92];
		String[] date = new String[100];
		
		File file = new File("temperatury.txt");
		Scanner scan = new Scanner(file);
		
		boolean strike = false;
		
		int[] temp = new int[100];
		int start = 0;
		int[] score = new int[100];
		
		
			for(int i = 0; i < arr.length; i++) 
			{
					arr[i] = scan.nextLine();
			}
		
		scan.close();
		
		for(int i = 0; i < arr.length; i++) 
		{
			date[i] = arr[i].split(";")[0];
			temp[i] = Integer.parseInt(arr[i].split(";")[1]);
		}
		for(int i = 0; i < temp.length; i++) 
		{
			if(temp[i] > 20 && !strike) 
			{
				strike = true;
				start = i;
			}
			if((temp[i] < 20 && strike) || (i == arr.length-1 && strike)) 
			{
				assignScore(score,start,i);
				strike = false;
			}
		}
		
		for(int i= 0; i < score.length; i++) 
		{
			if(score[i] == max(score)) 
			{
				System.out.println("Początek: "+date[score[i-2]]);
				System.out.println("Koniec: "+date[score[i-1]]);
			}
		}
		
	}
	public static int max(int[] score) 
	{
		int max = 1;
		for(int i=2; i < score.length; i +=3) 
		{
			if(score[i] > max) 
			{
				max = score[i];
			}
		}
		return max;
	}
	public static void assignScore(int[] score, int start, int i) 
	{
		for(int j=0; j < score.length; j++) 
		{
			if(score[j] == 0) 
			{
				score[j] = start;
				score[j+1] = i;
				score[j+2] = i - start + 1;
				break;
			}
		}
	}

}
