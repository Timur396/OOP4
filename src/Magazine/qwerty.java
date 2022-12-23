package Magazine;

import java.util.ArrayList;
import java.util.List;

public class qwerty {
    public static void main(String[] args) {
        example();

    }

    private static void example() {

        List<List> biDemArrList = new ArrayList<>();
        for (int i = 0; i < 8; i++) {
            biDemArrList.add(i, new ArrayList<>());
            for (int j = 0; j < 8; j++) {
                biDemArrList.get(i).add((i + j) % 2 == 1 ? "*" : "◯");
            }
        }
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(biDemArrList.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
}
