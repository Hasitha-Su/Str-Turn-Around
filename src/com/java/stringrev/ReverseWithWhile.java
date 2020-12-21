/*
 *  if i is the length of the string
 *  print the character at index i-1 
 *  use while loop only
 */

package com.java.stringrev;
import java.util.Scanner;

public class ReverseWithWhile {
	public static void main(String[] args) {
		
		String orgStr, revStr; 
		
		Scanner sc=new Scanner(System.in);  
		System.out.print("Enter your String: ");  
		orgStr = sc.nextLine();
		
		int i=orgStr.length();
		
		System.out.print("Reversed String: ");
		//while loop  
		while(i>0){  
			System.out.print(orgStr.charAt(i-1));   
			i--;  
		}
		sc.close();
	}
}