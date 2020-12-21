/*
 *  if i is the length of the string
 *  print the character at index i-1 
 */

package com.java.stringrev;
import java.util.Scanner;

public class ReverseWithFor {
	public static void main(String[] args) {
		
		String orgStr, revStr; 
		
		Scanner sc=new Scanner(System.in);  
		System.out.print("Enter a String: ");  
		orgStr = sc.nextLine();

		// length() returns the number of characters presents in the string
		for(int i=orgStr.length(); i>0; i--) {		
			// charAt() method returns the character at the specified index in a string
			System.out.print(orgStr.charAt(i-1));
		}
	}
}