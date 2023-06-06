package zadatak2;

import java.util.Objects;

import static zadatak2.App.*;

public class Test {

    public static void main(String[] args) {
        String infixExpression = "(a+3*b)-log(c/(d-2))";
        String postfixExpression = convertToPostfix(infixExpression);
        System.out.println("Postfix: " + postfixExpression);

        if (Objects.equals(postfixExpression, "a3b*+logcd2-/-")){
            System.out.println("Test passed");
        } else {
            System.out.println("Test failed");
        }
    }
}