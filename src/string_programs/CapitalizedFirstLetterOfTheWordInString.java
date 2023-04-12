package string_programs;

import java.util.Scanner;

public class CapitalizedFirstLetterOfTheWordInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the string: ");
		Scanner inputString= new Scanner(System.in);
		String str=inputString.nextLine();
		String upperCase="";
		
		Scanner sc=new Scanner(str);
		while(sc.hasNext())
		{
           String word=sc.next();
           upperCase+=Character.toUpperCase(word.charAt(0))+ word.substring(1)+" ";
			
		}
 System.out.println(str);
 System.out.println(upperCase);
	}

}
