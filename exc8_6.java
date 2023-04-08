import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exc8_6 {

    public static List<Integer> findSubArray(int[] arr, int m, double delta) {
        int start = 0;
        int end = 0;
        int sum = arr[0];
        List<Integer> subArr = new ArrayList<>();
        double lowerBound = m - delta;
        double upperBound = m + delta;
        while (end < arr.length) {
            if (lowerBound <= sum && sum <= upperBound) {
                subArr = new ArrayList<>();
                for (int i = start; i <= end; i++) {
                    subArr.add(arr[i]);
                }
                return subArr;
            } else if (sum < m) {
                end++;
                if (end < arr.length) {
                    sum += arr[end];
                }
            } else {
                sum -= arr[start];
                start++;
            }
        }
        return subArr;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[100];

        for (int i = 0; i < arr.length; i++) arr[i] = (int) (Math.random() * (100 - 5)) + 5;
        System.out.println("Введите m: ");
        int m = input.nextInt();
        System.out.println("Введите delta: ");
        double delta = input.nextDouble();
        List<Integer> subArr = findSubArray(arr, m, delta);
        System.out.println(subArr);
    }
}
