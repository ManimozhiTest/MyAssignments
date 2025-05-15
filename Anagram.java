package week3.day1;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		//Assigning string
		String text1= "stops";
		String text2="potss";
		
		//Converting string to char array
		
		char[] charArray= text1.toCharArray();
		char[] charArray1= text2.toCharArray();
		
		//sorting thr array
		
		Arrays.sort(charArray1);
		
		Arrays.sort(charArray);
		
		String s1= new String(charArray);
		
		String s2= new String(charArray1);
		
		System.out.println(s1+"----------"+s2);
		
		if(s1.equals(s2)) {
			System.out.println("Anagram");
		}
		else {
			System.out.println("Not Anagram");
		}
		}
		

	}


