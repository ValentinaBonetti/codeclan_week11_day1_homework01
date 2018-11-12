import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    WaterBottle waterBottle;

    @Before
    public void before(){
        waterBottle = new WaterBottle();
    }

    @Test
    public void drinkTest(){
        waterBottle.drink();
        assertEquals(90.0,waterBottle.getVolume(),0.01);
    }

    @Test
    public void emptyTest(){
        waterBottle.empty();
        assertEquals(0.0,waterBottle.getVolume(),0.01);
    }

    @Test
    public void fillTest(){
        waterBottle.fill();
        assertEquals(100,waterBottle.getVolume(),0.01);
    }

}
