package pl.kulik1234.coderbyte;

import org.junit.jupiter.api.Test;

import java.util.Stack;

import static org.junit.jupiter.api.Assertions.*;

class CTest {


    @Test
    void testTreeConstructor() {
        String[] t1 = {"(1,2)", "(2,4)", "(5,7)", "(7,2)", "(9,5)"};
        String[] t2 = {"(1,2)", "(3,2)", "(2,12)", "(5,2)"};
        String[] t3 = {"(1,2)", "(4,2)", "(6,4)", "(2,5)", "(8,10)", "(10,5)"};
        String[] t4 = {"(1,8)", "(14,8)", "(8,15)", "(17,19)", "(19,16)", "(16,15)", "(2,5)", "(15,20)", "(50,20)"};
        String[] t5 = {"(8,15)","(1,8)", "(50,20)", "(14,8)",  "(17,19)", "(2,5)", "(19,16)", "(16,15)", "(15,20)"};

        System.out.println("test 1");
        assertEquals(C.TRUE,C.TreeConstructor(t1));
        System.out.println("test 2");
        assertEquals(C.FALSE,C.TreeConstructor(t2));
        System.out.println("test 3");
        assertEquals(C.TRUE,C.TreeConstructor(t3));
        System.out.println("test 4");
        assertEquals(C.TRUE,C.TreeConstructor(t4));
        System.out.println("test 5");
        assertEquals(C.TRUE,C.TreeConstructor(t5));
    }
    @Test
    void testParseString(){
        String[] t1 = {"(1,2)", "(2,4)", "(5,7)", "(7,2)", "(9,5)"};
        int[][] t2 = {{1,2},{2,4},{5,7},{7,2},{9,5}};
        int[] r;
        for (int i = 0; i < t1.length; i++) {
            System.out.println("test "+i);
            r = C.parseString(t1[i]);
            assertEquals(t2[i][0],r[0]);
            assertEquals(t2[i][1],r[1]);
        }
    }

}