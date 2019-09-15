import java.util.Scanner;

class Twofer {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter your name");
        String inputName = myObj.nextLine();
        twofer(inputName);
    }

    public static String twofer(String inputName) {
        if(inputName == null) {
            return ("One for you, one for me.");
        } else {
            return ("One for " + inputName + ", one for me.");
        }
    }
}
