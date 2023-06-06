package zadatak5;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeSet;
import java.util.concurrent.ThreadLocalRandom;

public class AppClient {

    public static void main(String[] args) {

        CircularlyQueue<Integer> cq = new CircularlyQueue<>();
        // generate desired number of integers and put it into the queue
        genTest(10, cq);
        // list all elements
        cq.listAllQueueElements();
        // rotate it ones
        cq.rotate();
        System.out.println("\n<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<< After rotation >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>\n");
        // list all elements
        cq.listAllQueueElements();

        CircularlyQueue<Integer> wheel1 = Game.genRandPlacement();
        wheel1.listAllQueueElements();
        testSol(wheel1);
        System.out.println("------------------------------------------------------------------------------------------------------");
        System.out.println("-----------------------------------------GAME TEST----------------------------------------------------");
        System.out.println("------------------------------------------------------------------------------------------------------");
        CircularlyQueue<Integer> wheel = Game.genRandPlacement();
        ArrayList<Integer> pl1 = new ArrayList<>();
        ArrayList<Integer> pl2 = new ArrayList<>();
        ArrayList<Integer> pl3 = new ArrayList<>();
        HashMap<Integer, ArrayList<Integer>> players = new HashMap<>();
        players.put(1, pl1);
        players.put(2, pl2);
        players.put(3, pl3);
        Game.playGame(players, 5, wheel, 100);
        Game.results(players);

    }

    private static void testSol(CircularlyQueue<Integer> whl) {
        TreeSet<Integer> test = new TreeSet<>();
        while(!whl.isEmpty()) {
            test.add(whl.dequeue());
        }
        System.out.println(test);
    }

    private static CircularlyQueue<Integer> genTest(int numOfEl, CircularlyQueue<Integer> circ){
        for(int k = 0; k < numOfEl; k++) {
            circ.enqueue(ThreadLocalRandom.current().nextInt(0, numOfEl*10));
        }

        return circ;
    }
}
