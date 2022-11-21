package others;
import java.util.*;
public class Bubble {

	public static void main(String[] args) {
		int[] tab;
		int n;
		Scanner scan = new Scanner(System.in);
		System.out.println("How much numbers");
		n = scan.nextInt();
		tab = new int[n];
		for(int i = 0; i < n; i++) 
		{
			System.out.println("Input your: " + (i + 1));
			tab[i] = scan.nextInt();
		}
		scan.close();
		bubble(tab);
	}
	
	public static void bubble(int[] n) 
	{
		for(int i = 0; i < n.length; i++) {
			for(int j = i + 1; j < n.length; j++) 
			{
				if(n[j] < n[i]) 
				{
					int pom = n[j];
					n[j] = n[i];
					n[i] = pom;
				}
			}
			
		}
		for(int i = 0; i < n.length; i++) 
		{
			System.out.println(n[i]);
		}
		
	}

}
