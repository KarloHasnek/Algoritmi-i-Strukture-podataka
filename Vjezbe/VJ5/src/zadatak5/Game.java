package zadatak5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.ThreadLocalRandom;

public class Game {

    public static CircularlyQueue<Integer> genRandPlacement() {

        ArrayList<Integer> arrayList = new ArrayList<>();
        CircularlyQueue<Integer> wheel = new CircularlyQueue<>();
        int indx;
        int el;
        for (int i = 1; i < 40; i++) {
            arrayList.add(i);
        }
        while (arrayList.size() > 0) {
            indx = ThreadLocalRandom.current().nextInt(0, arrayList.size());
            el = arrayList.remove(indx);
            wheel.enqueue(el);
        }
        return wheel;
    }

    public static int spinWheel(CircularlyQueue<Integer> wheel, int boundRot) {
        int rot = ThreadLocalRandom.current().nextInt(3, boundRot);
        int cnt = 1;
        while (cnt <= rot) {
            wheel.rotate();
            cnt++;
        }
        return wheel.first();
    }

    public static HashMap<Integer, ArrayList<Integer>> playGame(HashMap<Integer, ArrayList<Integer>> plyrs, int attmpt,
                                                                CircularlyQueue<Integer> wheel, int boundRot) {
        int val;
        for (Integer key : plyrs.keySet()) {
            ArrayList<Integer> player = plyrs.get(key);
            for (int k = 1; k <= attmpt; k++) {
                val = spinWheel(wheel, boundRot);
                player.add(val);
            }
        }

        return plyrs;
    }

    public static void results(HashMap<Integer, ArrayList<Integer>> players) {

        for (Integer key : players.keySet()) {
            int cnt = 0;
            ArrayList<Integer> player = players.get(key);
            System.out.println("<<<<<<<<<<<<<<<<<<<< Individual results >>>>>>>>>>>>>>>>>>>>");
            System.out.println("Player -> " + key + ":");
            System.out.println(player);
            for (int k = 0; k < player.size(); k++) {
                if(player.get(k)%2 != 0) {
                    cnt++;
                }
            }
            System.out.println("Odd numbers in players' bag:  " + cnt);
        }
    }

}
