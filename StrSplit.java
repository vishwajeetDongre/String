package org.visshwa;
import java.util.*;
public class StrSplit {

	public static void main(String[] args) {
		Scanner S= new Scanner(System.in);
		System.out.println("enter the String");
		String str = S.nextLine();
		String[] ch = str.split(" ");
		String s="";
		for(int i=0;i<ch.length;i++)
		{String ss =" ";
			for(int j=ch[i].length()-1;j>=0;j--)
			{
				ss=ss+ch[i].charAt(j);
				
			}
			s=s+ss;
		}
		System.out.println(s);

	}

}
