package reverse;

import stack.ArrayStackImplementation;
import stack.STACK;

public class TestReverse {
    
    public static void main(String[] args) {
        
        String strng = "kako rjesiti problem";

        STACK<String> stog = new ArrayStackImplementation<>(strng.length());

        for (int i = 0; i < strng.length(); i++) {
            stog.push(String.valueOf(strng.charAt(i)));
        }


        String rev = "";

        for (int i = 0; i < strng.length(); i++) {
            rev += stog.pop();
            System.out.println(rev);
        }
    }
}
