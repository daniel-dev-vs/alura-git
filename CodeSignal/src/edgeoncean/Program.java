package edgeoncean;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//boolean retorno = checkPalindrome("aabaa");
		/*
		 * int[] array = {3, 6, -2, -5, 7, 3}; int retorno =
		 * adjacentElementsProduct(array); System.out.println(retorno);
		 */
		
		
		
		
	}
	
	public static boolean checkPalindrome(String inputString) {
		
		 char[] c = inputString.toCharArray();
		 
		 
		 for (int i = 0; i < c.length; i++) {			 
			 
			 if(c[i] != c[(c.length -1)-i] ) {
				 return false;				 
			 }
		}
		 
		 return true;
	}
	
	public static int adjacentElementsProduct(int[] inputArray) {
		
		int maxProduct = -1000;
		for (int i = 0; i < inputArray.length - 1; i++) {
			int max;
			
			max = inputArray[i] * inputArray[i+1];
			
			if(maxProduct < max) {
				maxProduct = max;
			}
			
		}
		
		return maxProduct;
	}

}
