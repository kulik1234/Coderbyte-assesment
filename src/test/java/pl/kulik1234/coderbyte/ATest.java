package pl.kulik1234.coderbyte;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ATest {
    @Test
    public void testNonrepeatingCharacter(){
        System.out.println("test 1");
        assertEquals("a",A.NonrepeatingCharacter("abcdef"));
        System.out.println("test 2");
        assertEquals("w",A.NonrepeatingCharacter("hello world hi hey"));
        System.out.println("test 3");
        assertEquals("w",A.NonrepeatingCharacter("walking tree"));
        System.out.println("test 4");
        assertEquals("k",A.NonrepeatingCharacter("agettkgaeee"));
        System.out.println("test 5");
        assertEquals("No Nonrepeating Character",A.NonrepeatingCharacter("aabbcc"));
    }

}