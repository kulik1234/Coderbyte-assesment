package pl.kulik1234.coderbyte;

import java.util.*;

public class A {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print(NonrepeatingCharacter(s.nextLine()));
    }
    public static String  NonrepeatingCharacter(String str){
        int length = str.length();
        String temp = "";
        Set<String> checked = new HashSet<String>();
        for (int i = 0; i < length-1; i++) {
            temp = str.substring(i,i+1);
            if(!checked.contains(temp)&&!str.substring(i+1).contains(temp)){
                return temp;
            }
            checked.add(temp);

        }
        return "No Nonrepeating Character";
    }

}
