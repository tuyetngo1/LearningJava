
public class Plane {
    boolean inAirport;
    boolean stormy;
    public boolean land() {
        if (stormy==true){
            inAirport = false;
        } else{
            inAirport = true;

        }
        return inAirport;
    }
    public boolean takeoff(){
        if (stormy==true){
        inAirport = true;}
        else {
            inAirport = false;
        }
        return inAirport;
    }


}
