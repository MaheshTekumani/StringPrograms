package StringPrograms;

import java.util.Scanner;

public class CountNoOfEvenNumbersInString {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String With Number");
		String st=sc.next();
		int count=0;

		 	for (int i = 0; i < st.length(); i++) {
				char ch=st.charAt(i);
				if(ch>='0'&& ch<='9')
				{
					if(ch%2==0)
					{
						count++;
					}
					
			
				
			}
			
		}System.out.println(count);
		
	}

}
