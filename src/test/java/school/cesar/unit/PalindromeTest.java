package school.cesar.unit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PalindromeTest {

    @Test
    public void palindrome_emptyPalindrome_emptyPalindrome() {
        Assertions.assertEquals(true , Palindrome.check(""));
    }

    @Test
    public void palindrome_yesPalindrome_yesPalindrome() {
        Assertions.assertEquals(true , Palindrome.check("ovo"));
    }

    @Test
    public void palindrome_noPalindrome_noPalindrome() {
        Assertions.assertEquals(false , Palindrome.check("dado"));
    }

    @Test
    public void palindrome_letterOnePalindrome_letterOnePalindrome() {
        Assertions.assertEquals(true , Palindrome.check("a"));
    }

    //Comandos do professor
    @Test
    public void check_stringLength1_True() {
        Assertions.assertTrue(Palindrome.check("a"));
    }

    @Test
    public void check_stringWithSameStartEnd_True() {
        Assertions.assertTrue(Palindrome.check("aa"));
    }

    @Test
    public void check_nonPalindromeWord_False() {
        Assertions.assertFalse(Palindrome.check("ab"));
    }

}
