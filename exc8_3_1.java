import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class exc8_3_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ans = 0;
        System.out.println("Сколько элементов? (Если нечет. то x2): ");
        int n = input.nextInt();

        if (n % 2 == 0)
            ans = n;
        else
            ans = 2 * n;

        System.out.println("Min граница: ");
        int min = input.nextInt();
        System.out.println("Max граница: ");
        int max = input.nextInt();
        int[] arr = new int[ans];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * (max - min)) + min;
        }
        System.out.println(Arrays.toString(arr));

        ArrayList<Integer> x = new ArrayList<>();
        ArrayList<Integer> y = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (i == 0)
                x.add(arr[i]);
            if (i % 2 == 0)
                x.add(arr[i]);
            else y.add(arr[i]);
        }

        System.out.println(x);
        System.out.println(y);

        int size = 0, counter = 0;

        if (x.size() >= y.size())
            size = x.size();
        else
            size = y.size();

        for (int i = 0; i <= size - 4; i++) {
            if (((x.get(i) == x.get(i + 2)) && (y.get(i) == y.get(i + 1)))) {
                counter++;
                System.out.printf("x1 = %d, x3 = %d\n", x.get(i), x.get(i + 2));
                System.out.printf("y1 = %d, y2 = %d\n", y.get(i), y.get(i + 1));
                System.out.println();
            } else if (((x.get(i + 1) == x.get(i + 3)) && (y.get(i) == y.get(i + 1)))) {
                counter++;
                System.out.printf("x2 = %d, x4 = %d\n", x.get(i + 1), x.get(i + 3));
                System.out.printf("y3 = %d, y4 = %d\n", y.get(i), y.get(i + 1));
                System.out.println();
            } else {
                counter += 0;
            }
        }
        if (counter > 0) {
            System.out.printf("Нашлось %d вершин прямоугольника, заебок!", counter);
        } else
            System.out.println("Хуйня");
    }
}
