import java.util.ArrayList;
import java.util.Arrays;

public class exc8_2_1 {

    public static void main(String[] args) {
        ArrayList<Integer> positive = new ArrayList<>();
        ArrayList<Integer> negative = new ArrayList<>();
        int[] arr = new int[200];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 200) - 100;
        }
        System.out.println(Arrays.toString(arr));

        for (int j : arr) {
            if (j >= 0)
                positive.add(j);
            else
                negative.add(j);
        }

        Integer[] smt = new Integer[positive.size()];
        for (int i = 0; i < smt.length; i++) smt[i] = positive.get(i);
        Arrays.sort(smt);
        for (int i = 0; i < smt.length; i++) positive.set(i, smt[i]);

        System.out.println(positive);

        smt = new Integer[negative.size()];

        for (int i = 0; i < smt.length; i++) smt[i] = negative.get(i);
        Arrays.sort(smt);
        for (int i = negative.size() - 1; i > -1; i--) negative.set(negative.size() -  1 - i, smt[i]);

        System.out.println(negative);

        negative.addAll(positive);

        System.out.println(negative);
    }
}
