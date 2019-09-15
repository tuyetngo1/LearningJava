import java.util.ArrayList;
import java.util.Arrays;

public class FizzBuzz {


    public static void main(String[] args) {
        FizzBuzz fizzbuzz = new FizzBuzz();
        System.out.println(fizzbuzz.play(2));
        ArrayList<Integer> myArray = fizzbuzz.play(2);
        System.out.println(myArray);
        for (int i = 0; i < myArray.size(); i++) {
            System.out.print(myArray.get(i)+" "+"\n");
        }
    }

    public ArrayList<Integer> play(int n) {
        ArrayList<Integer> myArray = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            myArray.add(i);
        }
        return myArray;
    }
}

//    public String print(ArrayList myArray) {
//        for (int i = 0; i < myArray.size(); i++) {
//             System.out.print(myArray.get(i).toString());
//        }
//
//    }
//
//}
