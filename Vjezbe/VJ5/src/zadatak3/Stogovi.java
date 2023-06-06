package zadatak3;

import java.util.Stack;

public class Stogovi {

    Stack<String> s1;
    Stack<String> s2;
    public Stogovi(Stack<String> s1, Stack<String> s2) {
        this.s1 = s1;
        this.s2 = s2;
    }
    public Stack<String> getS1() {
        return s1;
    }
    public Stack<String> getS2() {
        return s2;
    }
}
