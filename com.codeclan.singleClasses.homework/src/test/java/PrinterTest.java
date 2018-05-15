import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {


    Printer printer;

    @Before
    public void before(){
        printer = new Printer(10, 2);
    }

    @Test
    public void numberOfCopies(){
        assertEquals(8,printer.numberOfCopies());
    }

    @Test
    public void refillPrinter(){
        assertEquals(10,printer.refillPrinter());
    }

}
