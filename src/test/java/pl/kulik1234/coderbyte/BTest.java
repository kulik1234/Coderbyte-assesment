package pl.kulik1234.coderbyte;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BTest {
    @Test
    public void testPalindromeCreator(){
        System.out.println("test 1");
        assertEquals("not possible",B.PalindromeCreator("mmop"));
        System.out.println("test 2");
        assertEquals("k",B.PalindromeCreator("kjjjhjjj"));
        System.out.println("test 3");
        assertEquals("xw",B.PalindromeCreator("axbcdffdcwba"));
        System.out.println("test 4");
        assertEquals("palindrome",B.PalindromeCreator("dupaapud"));
        System.out.println("test 5");
        assertEquals("palindrome",B.PalindromeCreator("ijuklowolkuji"));
        System.out.println("test 6");
        assertEquals("jc",B.PalindromeCreator("abjchba"));

    }

    @Test
    public void testIsPalindrome(){
        System.out.println("test 1");
        assertEquals(false,B.isPalindrome("mmop"));
        System.out.println("test 2");
        assertEquals(true,B.isPalindrome("jjjhjjj"));
        System.out.println("test 3");
        assertEquals(false,B.isPalindrome("abcddffdcba"));
        System.out.println("test 4");
        assertEquals(true,B.isPalindrome("dupaapud"));
        System.out.println("test 5");
        assertEquals(true,B.isPalindrome("ijuklowolkuji"));
    }

    @Test
    public void testStringWithouChar(){
        System.out.println("test 1");
        assertEquals("nop",B.stringWithouChar("mnop",0));
        System.out.println("test 2");
        assertEquals("jjhjjj",B.stringWithouChar("jkjhjjj",1));
        System.out.println("test 3");
        assertEquals("abcddxdcba",B.stringWithouChar("abcddzxdcba",5));
        System.out.println("test 4");
        assertEquals("dupaapu",B.stringWithouChar("dupaapud",7));
        System.out.println("test 5");
        assertEquals("dupaapud",B.stringWithouChar("dupaapud",8));
        System.out.println("test 6");
        assertEquals("ijuklowolkuji",B.stringWithouChar("ijuklowolkuji",20));
    }
}