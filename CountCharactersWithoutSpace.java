package StringPrograms;

import java.util.Scanner;

public class CountCharactersWithoutSpace {

	public static void main(String[] args) {
		
	
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter The Sentence");
				String s=sc.nextLine();
				char ch[]=s.toCharArray();
				
				
			for (int i = 0; i < ch.length; i++) {
				String st="";
				while(i<ch.length&&ch[i]!=' ')
				{
					st=st+ch[i];
					i++;
					
				}
			
				if(st.length()>0)
				
					System.out.print(st+""+st.length());
				
				
			

	}

}
}