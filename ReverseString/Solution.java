package ReverseString;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String which you have to reversed: ");
		String s = sc.next();
		String ans ="";
		int i=s.length()-1;
		while(i>=0) {
			while(i>=0 && s.charAt(i) == ' ')i--;
			int j =i;
			if(i<0) break;
			
			while(i>=0 && s.charAt(i)!= ' ')i--;
			
			if(ans.isEmpty()) {
				ans = ans.concat(s.substring(i+1, j+1));
			}else {
				ans = ans.concat(" "+ s.substring(i+1,j+1));
			}
			
		}
		System.out.println("the reversed string is: "+ ans);

	}

}
