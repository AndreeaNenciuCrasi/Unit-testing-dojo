package com.codecool;

import java.util.Arrays;

public class PhraseReverse {
    public static String reverse(String str){
        return new StringBuilder(str).reverse().toString();
    }

    public static String reverseWords(String str){
        String[] words = str.split(" ");
        for(int i = 0; i < words.length; i++){
            words[i] = reverse(words[i]);
        }
        return join(words, " ");
    }

    public static String reverseWordOrder(String str){
        String[] words = str.split(" ");
        return join(reverseArray(words), " ");
    }

    public static String reverseN(String str, int n){
        StringBuilder sb = new StringBuilder(str.substring(0, n));
        sb.reverse();
        sb.append(str.substring(n, str.length()));
        return sb.toString();
    }

    // helper functions but test these too
    
    public static String[] reverseArray(String[] x){
        String[] rev = Arrays.copyOf(x, x.length);
        for(int i = x.length - 1; i >= 0; i--){
            rev[x.length - 1 - i] = x[i];
        }
        return rev;
    }

    public static String join(String[] arr, String joinStr){
        StringBuilder joined = new StringBuilder();
        for(int i = 0; i < arr.length; i++){
            joined.append(arr[i]);
            if(i < arr.length - 1) joined.append(joinStr);
        }
        return joined.toString();
    }

    public static void main(String[] args){
        final String str = "this is one long sentence without punctuation";

        System.out.println("Straight-up reversed: " + reverse(str));
        System.out.println("Reversed words: " + reverseWords(str));
        System.out.println("Reversed word order: " + reverseWordOrder(str));
        System.out.println("Reverse first 5: " + reverseN(str, 5));
    }
}
