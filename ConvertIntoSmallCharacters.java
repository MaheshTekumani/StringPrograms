package StringPrograms;

import java.util.Scanner;

public class ConvertIntoSmallCharacters {
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the String");
		
		String st=sc.nextLine(); 
		//"MAHESHCHINNA2907@gmail.com";
		char[] c=st.toCharArray();
		for (int i = 0; i < c.length; i++) {
			if(c[i]>='A'&&c[i]<='Z')
			{
				c[i]=(char) (c[i]+32);
			}
		}
			System.out.println(c);
			
		}
	}


