package com.adithya.assement.java;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static int romanToInt(String roman) {
        Map<Character, Integer> romanNumerals = new HashMap<>();
        romanNumerals.put('I', 1);
        romanNumerals.put('V', 5);
        romanNumerals.put('X', 10);
        romanNumerals.put('L', 50);
        romanNumerals.put('C', 100);
        romanNumerals.put('D', 500);
        romanNumerals.put('M', 1000);

        int result = 0;
        int prevValue = 0;

        for (int i = roman.length() - 1; i >= 0; i--) {
            char currentSymbol = roman.charAt(i);
            int currentValue = romanNumerals.get(currentSymbol);

            if (currentValue < prevValue) {
                result -= currentValue;
            } else {
                result += currentValue;
            }

            prevValue = currentValue;
        }

        return result;
    }

    public static void main(String[] args) {
        String romanNumeral = "XII";
        int integerEquivalent = romanToInt(romanNumeral);
        System.out.println("Roman Numeral: " + romanNumeral);
        System.out.println("Integer Equivalent: " + integerEquivalent);
    }
}
