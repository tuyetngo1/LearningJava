import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.TypeSafeMatcher.*;
import static org.junit.Assert.*;

public class AirportTest {
    Airport airport;
    @Before
    public void setUpAirport(){
        airport = new Airport();
    }

    Plane plane1;
    Plane plane2;
    Plane plane3;

    @Before
    public void setUpPlane(){
        plane1 = new Plane();
        plane2 = new Plane();
        plane3 = new Plane();
    }

    @Test
    public void cantLandWhenAirportFull() {
        airport.instructPlaneToLand(plane1);
        airport.instructPlaneToLand(plane2);
        airport.full();
        airport.instructPlaneToLand(plane3);
        assertFalse(airport.planes.contains(plane3));
    }
    @Test
    public void canOverrideCapacity(){
        airport.changecapacity(10);
        assertEquals(airport.CAPACITY, 10);
    }
}
