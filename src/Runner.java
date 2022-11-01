import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an expression with *, /, +, -, %, or ^: ");
        String expression = scan.nextLine();


        String first = expression.substring(0, expression.indexOf(" ") + 1);
        int firstNum = Integer.parseInt(first);

        String operator = expression.substring(expression.indexOf(" ") + 1, expression.indexOf(" ") + 2);

        String second = expression.substring(expression.indexOf(" ") + 3);
        int secondNum = Integer.parseInt(second);

        if (operator.equals("+")) {

        }


    }
}
