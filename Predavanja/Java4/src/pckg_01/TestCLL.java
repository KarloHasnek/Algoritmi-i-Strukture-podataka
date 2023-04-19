package pckg_01;

public class TestCLL {
    
    public static void main(String[] args) {
        CLL<Integer> clli = new CLL<>();
        System.out.println("Size: " + clli.size());     
        clli.addFirst(100);
        System.out.println("Size: " + clli.size());
        System.out.println(clli);
        clli.addLast(1000);
        System.out.println(clli);
        clli.rotate();
        System.out.println(clli);
        //Integer element1 = clli.removeFirst();
        //Integer element2 = clli.removeFirst();
        //Integer element3 = clli.removeFirst();
        boolean ans = clli.containsElement(100);
        System.out.println(ans);

    }
}
