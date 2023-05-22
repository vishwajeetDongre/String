package org.visshwa;
import java.util.*;

public class ArrayOccrance {

	public static void main(String[] args) {
		int count=1;
		Scanner S= new Scanner(System.in);
		System.out.println("enter the String");
		String ch=S.nextLine();
		char a[]=ch.toCharArray();
		for(int i=0;i<ch.length();i++)
		{    count=1;
			for(int j=i+1;j<ch.length();j++)
			{
				if(a[i]==a[j])
				{
					count++;
					a[j]='\0';
				}
			}
			if(a[i]!='\0'&& a[i]!=32)
			{
				System.out.println(a[i]+"====>"+count);
			}
		}

	}

}
