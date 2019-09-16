import static spark.Spark.*;

public class HelloWorld {
    public static void main(String[] args) {
        port(9000); get("/hello", (req, res) -> "Hello World");
    }
}