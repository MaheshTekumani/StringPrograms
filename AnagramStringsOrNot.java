package StringPrograms;

import java.util.Scanner;

public abstract class AnagramStringsOrNot {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
System.out.println("This is done by Hari");
		System.out.println("Enter The String");
		String s=sc.nextLine();
		System.out.println("Enter The String");
		String s1=sc.nextLine();
		
		boolean st=isAnagram(s,s1);
		if(st)
			System.out.println("is anagram");
		else 
			System.out.println("is not anagram");
		
	
	}
		static private boolean isAnagram(String s1,String s2)
		{
			int n[]=new int[26];
			int n1[]=new int[26];
		for (int i = 0; i < s1.length(); i++)
		{
			char ch=s1.charAt(i);
			if(ch>='A'&&ch<='Z')
			{
				n[ch-65]++;
			}
			else if(ch>='a'&&ch<='z')
			{
				n[ch-97]++;
			}
		}
		for (int i = 0; i < s2.length(); i++)
		{
			char ch1=s2.charAt(i);
			if(ch1>='A'&&ch1<='Z')
			{
				n1[ch1-65]++;
			}
			else if(ch1>='a'&&ch1<='z')
			{
				n1[ch1-97]++;
			}
		}
		for (int i = 0; i < 26; i++)
		{
			if(n[i]!=n1[i])				
		
				return false;
				
		}
		
			return true;
		
}
		
			
		}
