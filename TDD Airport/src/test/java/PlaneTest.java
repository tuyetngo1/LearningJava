import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
public class PlaneTest {
    Plane plane;
    @Before
    public void setUp(){
        plane = new Plane();
    }

    @Test
    public void testPlaneCanLand(){
        plane.land();
        assertTrue(plane.inAirport == true);
    }

    @Test
    public void testPlaneCanTakeOff(){
        plane.takeoff();
        assertTrue(plane.inAirport == false);
    }

    @Test
    public void cantTakeOffWhenStormy(){
        plane.stormy = true;
        plane.takeoff();
        assertTrue(plane.inAirport == true);

    }

    @Test
    public void canTakeOffWhenNiceWeather(){
        plane.stormy = false;
        plane.takeoff();
        assertTrue(plane.inAirport== false);
    }

    @Test
    public void cantLandWhenStormy(){
        plane.stormy=true;
        plane.land();
        assertTrue(plane.inAirport==false);
    }

    @Test
    public void canLandWhenNiceWeather(){
        plane.stormy = false;
        plane.land();
        assertTrue(plane.inAirport== true);
    }
}
