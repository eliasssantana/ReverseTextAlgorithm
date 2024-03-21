package org.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringUtilsTest {

    @Test
    public void reverseText_useCases(){

        assertEquals("abc2132", StringUtils.reverse("2312cba"));
        assertEquals("ba", StringUtils.reverse("ab"));
    }

    @Test(expected = RuntimeException.class)
    public void reverseText_exceptionThrownCase(){

        assertEquals("cda1", StringUtils.reverse(null));
    }

    @Test
    public void reverseOddsText(){
        assertEquals("ub32tca192", StringUtils.reverseOddsText("2b12cta39u"));
    }

    @Test(expected = RuntimeException.class)
    public void reverseOddsText_exceptionThrownCase(){
        assertEquals("ub32tca192", StringUtils.reverseOddsText(null));
    }

}
