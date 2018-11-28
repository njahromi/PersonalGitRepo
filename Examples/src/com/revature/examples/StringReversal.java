package com.revature.examples;

public class StringReversal {

	public static Object main(String[] args) {
		/**
		 * 1. Without using the StringBuilder or StringBuffer class, write a method that
		 * reverses a String. Example: reverse("example"); -> "elpmaxe"
		 *
		 * @param string
		 * @return
		 */
		String reverse(String string) {
			return null;
			
			char[] charArray;
			
			charArray = new char[7];
			
			char[] charArray1{"e","x","a","m","p","l","e"}
					
					for(int i=0; i<charArray1.length/2; i++){
						  char temp = charArray1[i];
						  charArray1[i] = charArray1[charArray1.length -i -1];
						  charArray1[charArray1.length -i -1] = temp;
						}
		}

	}

}
