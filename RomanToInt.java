package MyProject;

import java.util.HashMap;
import java.util.Scanner;

public class RomanToInt {

	public static void main(String[] args) {
	       
	        HashMap<Character, Integer> romanValues = new HashMap<>();
	        romanValues.put('I', 1);
	        romanValues.put('V', 5);
	        romanValues.put('X', 10);
	        romanValues.put('L', 50);
	        romanValues.put('C', 100);
	        romanValues.put('D', 500);
	        romanValues.put('M', 1000);

	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a Roman numeral: ");
	        String romanNumeral = scanner.nextLine().toUpperCase();

	        int result = romanToInteger(romanNumeral, romanValues);

	        System.out.println("Integer equivalent: " + result);
	    }

	    private static int romanToInteger(String romanNumeral, HashMap<Character, Integer> romanValues) {
	        int result = 0;
	        int prevValue = 0;

	        for (int i = romanNumeral.length() - 1; i >= 0; i--) {
	            char currentChar = romanNumeral.charAt(i);
	            int currentValue = romanValues.get(currentChar);

	            if (currentValue < prevValue) {
	                result -= currentValue;
	            } else {
	                result += currentValue;
	            }
	            
	            prevValue = currentValue;
	        }

	        return result;
	    }
	}


