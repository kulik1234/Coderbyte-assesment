package pl.kulik1234.coderbyte;

import java.util.*;

public class C {

    public static final String TRUE = "true";
    public static final String FALSE = "false";


    public static String TreeConstructor(String[] strArr) {
        Set<Node> parents = new HashSet<>();

        int[] r = new int[2];
        for(String s : strArr){
            r = parseString(s);
            parents.add(new Node(r[1]));
        }
        Node[] nodes = new Node[parents.size()];
        for(String s : strArr){
            r = parseString(s);
            int[] finalR = r;
            Node p = parents.stream().filter(e -> e.getValue() == finalR[1]).findFirst().get();
            if(r[0] < p.getValue() ){
                if(p.getLeft() != null){
                    return FALSE;
                }
                p.setLeft(new Node(r[0]));
            } else {
                if(p.getRight() != null){
                    return FALSE;
                }
                p.setRight(new Node(r[0]));
            }
        }
        return TRUE;
    }





    public static int[] parseString(String s){
        Object[] i = Arrays.stream(s.split(",")).map(elem -> {
            String temp;
            temp = elem.replace("(","");
            temp = temp.replace(")","");
            return Integer.parseInt(temp);
        }).toArray();
        int[] r = {(int)i[0],(int)i[1]};
        return r;
    }

    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        //System.out.print(TreeConstructor(s.nextLine()));
    }
}

class Node {
    private int value;
    private Node left;
    private Node right;

    public Node(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }


    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }


}

