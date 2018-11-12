import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer;

    @Before
    public void before(){
        printer = new Printer();
    }

    @Test
    public void printTest_AvailableSheets(){
        assertEquals(true,printer.print(100,50));
        assertEquals(5000,printer.getSheetsOfPaperAvailable());
    }

    @Test
    public void printTest_SheetsNotAvailable(){
        assertEquals(false,printer.print(100,1000));
    }

    @Test
    public void getTonerVolumeTest(){
        printer.print(10,10);
        assertEquals(9900,printer.getTonerVolume());
    }

}
