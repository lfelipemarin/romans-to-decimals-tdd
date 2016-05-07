package main;

/**
 * Created by felipe on 4/05/16.
 */
public class Conversion {

    public int convertRomanToDecimal(String roman) {
        //int i = 0;
        int v = 0;
        int[] nums = new int[roman.length()];
        int suma = 0;
        for (int j = 0; j < roman.length(); j++) {
            String romana = String.valueOf(roman.charAt(j));
            switch (romana.toUpperCase()) {
                case "I":
                    nums[j] = 1;
                    break;
                case "V":
                    nums[j] = 5;
                    break;
                case "X":
                    nums[j] = 10;
                    break;
                case "L":
                    nums[j] = 50;
                    break;
                case "C":
                    nums[j] = 100;
                    break;
                case "D":
                    nums[j] = 500;
                    break;
                case "M":
                    nums[j] = 1000;
                    break;
                default:
                    nums[j] = 0;
            }
        }

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] < nums[i + 1]) {
                suma -= nums[i];
            } else {
                suma += nums[i];
            }
        }
        suma += nums[nums.length - 1];
        return suma;
    }
}
