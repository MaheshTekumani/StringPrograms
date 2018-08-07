package StringPrograms;

import java.util.Scanner;

public class CountingWordsInSentence {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the sentence");
		String s=sc.nextLine();//" hi i am mahesh";
		int nc=noOfWords(s);
		System.out.println("Number of Words "+nc);
	}

	private static int noOfWords(String s) {
		
		int count=0;
		char c[]=s .toCharArray();
String s1="";
		for (int i = 0; i < c.length; i++) {
			if(i==0&&c[i]!=' '||c[i]!=' '&&c[i-1]==' ')
			{
				count++;
				s1=s1+c[i];
			}
			
		}
System.out.println(s1);
		return count;
	}

}

	
