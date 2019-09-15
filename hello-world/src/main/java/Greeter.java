//class Greeter {
//
//    public static void main(String[] args){
//        System.out.println(getGreeting());
//    }
//
//    public static String getGreeting() {
//        return "Hello, World!";
//    }
//}

import static spark.Spark.*;

public class HelloWorld {
    public static void main(String[] args) {
        get("/hello", (req, res) -> "Hello World");
    }
}

