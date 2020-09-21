package main;

public class RomanConverter {
    public static String intToRomanNumerals(int number) {
        if(number < 1) {
            return null;
        }
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] romanLiterals = {"M", "CM", "D", "CD", "C,", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        StringBuilder roman = new StringBuilder();


        for(int i=0; i < values.length; i++) {
            while(number >= values[i]) {
                number -= values[i];
                roman.append(romanLiterals[i]);
            }
        }

        return roman.toString();
    }
}
