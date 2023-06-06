package zadatak3;

import java.util.Stack;

public class StogManipulation {

    public static Stogovi performStackOperations(Stack<String> s1, Stack<String> s2) {
        System.out.println("Stog S1 na početku: " + s1);
        System.out.println("Stog S2 na početku: " + s2);

        // Kloniranje stoga S2 u S1
        Stack<String> s1Clone = (Stack<String>) s2.clone();

        // Brisanje elemenata iz stoga S2
        s2.clear();

        // Prebacivanje elemenata iz stoga S1 u S2
        while (!s1.isEmpty()) {
            s2.push(s1.pop());
        }

        System.out.println("Stog S1 na kraju: " + s1Clone);
        System.out.println("Stog S2 na kraju: " + s2);

        return new Stogovi(s1Clone, s2);
    }
}
