package BasicChallenges;

public class BasicOperations {

    public static int basicMath(String operation, int x, int y) {

        return switch (operation) {
            case "+" -> x + y;
            case "-" -> x - y;
            case "*" -> x * y;
            case "/" -> x / y;
            default -> 0;
        };
    }

    public static void main(String[] main){

        System.out.println(basicMath("+", 5, 4));

    }
}
