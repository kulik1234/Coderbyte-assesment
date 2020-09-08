package pl.kulik1234.coderbyte;

import java.util.Scanner;
import java.util.Stack;

public class D {
    public static String ReversePolishNotation(String str) {
        Stack<Integer> stack = new Stack();
        String[] array = str.split(" ");
        for (String item : array) {
            switch (item){
                case "+" : stack.push(stack.pop()+stack.pop());break;
                case "-" : stack.push(stack.pop()-stack.pop());break;
                case "*" : stack.push(stack.pop()*stack.pop());break;
                case "/" : stack.push(stack.pop()/stack.pop());break;
                default: stack.push(Integer.parseInt(item));
            }
        }
        return String.valueOf(stack.pop());
    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(ReversePolishNotation(s.nextLine()));
    }
}
