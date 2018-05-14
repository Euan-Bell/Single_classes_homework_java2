import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestCalculator {

    Calculator calculator;

    @Before
    public void before(){
        calculator = new Calculator(10,10);
        }

    @Test
    public void addNumbers(){
        assertEquals( 20, calculator.addnumbers());
        }

    @Test
    public void subtractNumbers(){
        assertEquals(0, calculator.subtractNumbers());
        }

     @Test
    public void multiplyNumbers(){
        assertEquals(100, calculator.multiplyNumbers());
     }

     @Test
    public void divideNumbers(){
        assertEquals(1,calculator.divideNumbers());
     }
}
