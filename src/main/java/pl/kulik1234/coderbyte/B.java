package pl.kulik1234.coderbyte;

import java.util.Scanner;

public class B {

    public static final String NOT_POSSIBLE ="not possible";
    public static final String PALINDROME ="palindrome";

    public static String PalindromeCreator(String str) {
        if(str.length() < 3){
            return NOT_POSSIBLE;
        }
        if(isPalindrome(str)){
            return PALINDROME;
        }

            String output1 = "";
            String output2 = "";
            String test1 = "";
            String test2 = "";
            int limit = Math.round(str.length() / 2);
            for (int i = 0; i < limit; i++) {

                char c = str.charAt(str.length() - 1 - i);
                char c1 = str.charAt(i);

                if(c1 != c) {
                    if(isPalindrome(stringWithouChar(str,i))) {
                        return String.valueOf(c1);
                    }
                    else if(isPalindrome(stringWithouChar(str,str.length()-1-i))) {
                        return String.valueOf(c);
                    } else {
                        output1 = String.valueOf(c1);
                        output2 = String.valueOf(c);
                        test1 = stringWithouChar(str,i);
                        test2 = stringWithouChar(str,str.length()-1-i);
                       break;
                    }
                }
            }

            limit = Math.round(test1.length()/2);

            for (int i = 0; i < limit; i++) {

                char c = test1.charAt(test1.length() - 1 - i);
                char c1 = test1.charAt(i);

                if(c1 != c) {
                    if(isPalindrome(stringWithouChar(test1,i))&&test1.length()>3) {
                        return output1 + String.valueOf(c1);
                    }
                    else if(isPalindrome(stringWithouChar(test1,test1.length()-1-i))&&test1.length()>3) {
                        return output1 + String.valueOf(c);
                    } else {
                       break;
                    }
                }
            }
            limit = Math.round(test2.length()/2);

            for (int i = 0; i < limit; i++) {

                char c = test2.charAt(test2.length() - 1 - i);
                char c1 = test2.charAt(i);

                if(c1 != c) {
                    if(isPalindrome(stringWithouChar(test2,i))&&test2.length()>3) {
                        return output2 + String.valueOf(c1);
                    }
                    else if(isPalindrome(stringWithouChar(test2,test2.length()-1-i))&&test2.length()>3) {
                        return output2 + String.valueOf(c);
                    } else {
                       return NOT_POSSIBLE;
                    }
                }
            }

    return NOT_POSSIBLE;
    }


    public static String stringWithouChar(String str,int index) {
        if(index > str.length()-1){
            return str;
        }
        return str.substring(0,index)+str.substring(index+1);
    }

    public static boolean isPalindrome(String str){
        char[] chars = str.toCharArray();
        int length = chars.length;
        int limit = Math.round(length/2);
        for(int i = 0; i < limit;i++){
            if(chars[i] != chars[length-1-i]){
                return false;
            }
        }
        return true;
    }

    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print(PalindromeCreator(s.nextLine()));
    }
}
