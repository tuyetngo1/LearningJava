import java.util.ArrayList;

public class Airport {
    int CAPACITY = 2;
    ArrayList<Object> planes = new ArrayList<>();
public void instructPlaneToLand(Plane plane) {
    if (full() ==true){

    }else{
        plane.land();
        planes.add(plane);
    }


}
public int changecapacity(int i){
    CAPACITY = i;
    return CAPACITY;
}
public void instructPlaneToTakeoff(Plane plane) {
plane.takeoff();
planes.remove(plane);

}

public boolean full(){
   if (planes.size() >= CAPACITY) {
       return true;
   }
   else {
       return false;
   }

}


}
