package com.zipcodewilmington;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {
    private static String[] copyOf;

    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {
        return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {
        return array[array.length - 1];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        return array[array.length - 2];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        for (String s : array) {
            if (s == value) {
                return true;
            }

        }

        return false;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        for (int q = 0; q < array.length / 2; q++) {
            String reverse = array[q];
            array[q] = array[array.length - q - 1];
            array[array.length - q - 1] = reverse;

        }

        return array;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    //reverse array with a loop revArray
    //compare array to revArray with if statement
    public static boolean isPalindromic(String[] array) {
        for (int q = 0; q <= array.length / 2 && array.length != 0; q++) {
            if (array[q] != array[array.length - q - 1]) {
                break;
            }
            return true;
        }


        return false;
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    // change array
    public static boolean isPangramic(String[] array) {
        int charCount = 0;
        String isPanArr = Arrays.toString(array).toLowerCase();
        String alpha = "abcdefghijklmnopqrstuvwxyz";
        for(int i = 0; i < alpha.length(); i++){
            for(int j= 0; j < isPanArr.length(); j++){
                if (alpha.charAt(i) == isPanArr.charAt(j)) {
                    charCount++;
                    break;


                }


            }
        }
        if(charCount == 26){
            return true;
        }
            return false;



    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int answer = 0;
        for (int q = 0; q < array.length; q++) {
            if (array[q].equals(value)) {
                answer++;
            }

        }

        return answer;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
       String[] answerArray = new String[array.length - 1];
       int count =0;

        for (String i : array) {
            if (!i.equals(valueToRemove)) {
                answerArray[count++] = i;
            }
          }



        return answerArray;
    }





    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        String newArStr = array[0];
        for(int q = 1; q < array.length; q++){
            if(array[q] == array[q-1]){

            }
            else if(array[q] != array[q- 1]){
                newArStr += " " + array[q];
                System.out.println(newArStr);
            }
        }
        String[] answer = newArStr.split(" ");
        return answer;
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {int counter = 0;
        String newArStr = "";
        String temp = array[0];
        for(int q = 0;q <array.length;q++){
            if(array[q] == temp){
                newArStr += array[q];
            }else {
                newArStr += " " + array[q];
                temp = array[q];
            }


        }

        String[] answer = newArStr.split(" ");
        System.out.println(newArStr);
        return answer;
    }


}
