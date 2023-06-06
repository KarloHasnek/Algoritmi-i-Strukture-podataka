package zadatak3;

import java.util.Stack;
import static zadatak3.StogManipulation.performStackOperations;

public class Test {

    public static void main(String[] args) {
        Stack<String> stog1 = new Stack<>();
        Stack<String> stog2 = new Stack<>();

        stog1.push("1");
        stog1.push("2");
        stog1.push("3");
        stog1.push("4");
        stog1.push("5");
        stog2.push("prvi");
        stog2.push("drugi");
        stog2.push("treći");
        stog2.push("cetvrti");
        stog2.push("peti");

        performStackOperations(stog1, stog2);
    }
}
