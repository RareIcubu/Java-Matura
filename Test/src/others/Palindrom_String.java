package others;

public class Palindrom_String {

	public static void main(String args[]) 
	{
		String[] arr = {"ala","małgosia","anna","bogusia"};
	
		for(String element : arr) 
		{
			char[] characters = element.toCharArray();
			String name = element, subname = "";
			for(int j = characters.length - 1; j > -1; j--) 
			{
				
				subname += characters[j];
			}
			if(subname.equals(name)) 
			{
				System.out.println("Palindrom: "+name);
			}
		}
	
	}
	
}
