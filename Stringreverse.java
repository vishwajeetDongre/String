package org.visshwa;
import java.util.*;
public class Stringreverse {

	public static void main(String[] args) {
		Scanner S= new Scanner(System.in);
		System.out.println("enter the String");
		String a=S.nextLine();
		char ch[]=a.toCharArray();
		 int start=0;
		 int mid=ch.length/2;
		 int end=ch.length-1;
		 for(start=0;start<mid;start++)
		 {
			 char temp=ch[start];
			 ch[start]=ch[end];
			 ch[end]=temp;
			 end--;
		 }
		 
       for(int i=0;i<ch.length;i++)
       {
    	   System.out.print(ch[i]);
       }
	}

}
