import java.util.Scanner;
class ReverseString {
    public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);
    System.out.println("Enter a string");
    String inputString = myObj.nextLine();
    reverse(inputString);
    }


    public static String reverse(String inputString) {
        char ch[] = inputString.toCharArray();
        String reverse ="";
        for (int i=ch.length-1; i>=0; i--) {
            reverse+=ch[i];
        }
        return reverse;
    }
}

