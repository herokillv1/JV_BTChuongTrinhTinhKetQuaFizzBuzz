import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTranslateTest {

    @Test
    void translate1() {
        String result = FizzBuzzTranslate.translate(3);
        assertEquals("Fizz",result);
    }

    @Test
    void translate2() {
        String result = FizzBuzzTranslate.translate(5);
        assertEquals("Buzz",result);
    }

    @Test
    void translate3() {
        String result = FizzBuzzTranslate.translate(15);
        assertEquals("FizzBuzz",result);
    }

    @Test
    void translate4() {
        String result = FizzBuzzTranslate.translate(2);
        assertEquals("hai ",result);
    }

    @Test
    void translate5() {
        String result = FizzBuzzTranslate.translate(7);
        assertEquals("bay ",result);
    }

    @Test
    void translate6() {
        String result = FizzBuzzTranslate.translate(13);
        assertEquals("Fizz",result);
    }

    @Test
    void translate7() {
        String result = FizzBuzzTranslate.translate(56);
        assertEquals("Buzz",result);
    }

    @Test
    void translate8() {
        String result = FizzBuzzTranslate.translate(14);
        assertEquals("mot bon ",result);
    }
}