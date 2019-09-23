import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Lab3Test {

    @Test
    void isBalanced() {
        String s1 = "( a + b * ( c / ( d – e ) ) ) + ( d / e )";
        boolean actual = Lab3.isBalanced(s1);
        boolean expected = true;
        assertEquals(expected, actual);


        //balanced
        String s2 = "(2+[5+7]+1)";
        actual = Lab3.isBalanced(s2);
        expected = true;
        assertEquals(expected, actual);

        //stack.isEmpty
        String s3 = ")";
        actual = Lab3.isBalanced(s3);
        expected = false;
        assertEquals(expected, actual);

        //balanced && stack.isEmpty
        String s4 = "[(2+[5+7]+1) - 6]";
        actual = Lab3.isBalanced(s4);
        expected = true;
        assertEquals(expected, actual);


    }
}