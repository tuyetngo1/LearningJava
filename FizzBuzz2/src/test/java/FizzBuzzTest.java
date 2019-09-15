import org.junit.Before;
import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import java.util.ArrayList;


public class FizzBuzzTest {
    FizzBuzz fizzbuzz;
    private Object Integer;
    private Object ArrayList;

    @Before
    public void setup(){
        fizzbuzz = new FizzBuzz();
    }


    @Test
    public void testListReturnAnArray() {
        ArrayList<Integer> array = fizzbuzz.play(2);
        assertTrue(array.size()==2);
    }


    @Test
    public void testListReturnFizzfor3() {
        ArrayList<Integer> array = fizzbuzz.play(3);
        assertArrayEquals(ArrayList<Integer> [1, 2, "Fizz"],array);
    }

}

