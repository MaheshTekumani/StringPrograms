package StringPrograms;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Sentence");
		String s=sc.nextLine();
		boolean s1=checkPolin(s);
		System.out.println(s1);
	}

	private static boolean checkPolin(String s) {
		char[] ch=s.toCharArray();
		int i=0;
		while(i<ch.length/2)
		{
			if(ch[i]!=ch[ch.length-1-i])
			{
				return false;
			}
			i++;
		}return true;
		
		
		
		
	}

}
