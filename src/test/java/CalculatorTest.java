import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator = new Calculator();


    @Test
    public void canAdd(){
        assertEquals(5,calculator.add(2,3));
    }

    @Test
    public void canSubtract(){
        assertEquals(3,calculator.subtract(5,2));
    }

    @Test
    public void canMultiply(){
        assertEquals(6,calculator.multiply(2,3));
    }

    @Test
    public void canDivide(){
        assertEquals(3.33,calculator.divide(10,3),0.01);
    }

}
