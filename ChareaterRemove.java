package org.visshwa;
import java.util.*;

//charater remove for String
public class ChareaterRemove {

	public static void main(String[] args) {
		Scanner S= new Scanner(System.in);
		System.out.println("Enter the String");
		String name=S.nextLine();
		char b[]=name.toCharArray();
		System.out.println("enter the charater you want to delete");
		char s=S.nextLine().charAt(0);
		
		String name1="";
	
		for(int i=0;i<b.length;i++)
		{
			if(b[i]==s)
			{ 
				continue;
			}else
			{
				name1=name1+b[i]; // String concat karnyasathi used
				
			}
			
		}
		
			System.out.println(name1);
		
	

	}

}
