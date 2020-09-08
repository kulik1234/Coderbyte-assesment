package pl.kulik1234.coderbyte;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DTest {

    @Test
    void reversePolishNotation() {
        System.out.println("test 1");
        assertEquals("4",D.ReversePolishNotation("1 1 + 1 + 1 +"));
        System.out.println("test 2");
        assertEquals("27",D.ReversePolishNotation("4 5 + 2 1 + *"));
        System.out.println("test 3");
        assertEquals("13",D.ReversePolishNotation("3 5 2 * +"));
        System.out.println("test 4");
        assertEquals("20",D.ReversePolishNotation("3 5 2 8 6 20 25 + + + * / -"));
    }

}