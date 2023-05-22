package org.visshwa;
import java.util.*;
public class StringReversePosition {

	public static void main(String[] args) {
     Scanner S= new Scanner(System.in);
     System.out.println("enter the String");
     String name=S.nextLine();
       String name1[]=name.split(" ");
       String s=" ";
       for(int i=0;i<name1.length;i++)
       {   String str=" ";
    	   for(int j=name1[i].length()-1;j>=0;j--)
    	   {
    		   str=str+name1[i].charAt(j);
    	   }
    	  s=s+str; 
       }
     System.out.println(s);
    	
    	
     }

	}


