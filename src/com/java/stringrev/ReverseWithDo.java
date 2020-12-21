/*
 *  if i is the length of the string
 *  print the character at index i-1 
 *  use Do While loop only
 */
package com.java.stringrev;
import java.util.Scanner;

public class ReverseWithDo {
	public static void main(String[] args) {

		String orgStr, revStr; 
		
		Scanner sc=new Scanner(System.in);  
		System.out.print("Enter your String: ");  
		
		orgStr = sc.nextLine();
		
		int i= orgStr.length(); 
		
		System.out.print("Reversed String: ");  
		//do-while loop  
		do{     
			System.out.print(orgStr.charAt(i-1));
			i--;
		}while(i>0); 
		
		sc.close();
	}
}