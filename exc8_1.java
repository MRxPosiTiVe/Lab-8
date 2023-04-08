import java.util.ArrayList;
import java.util.Scanner;

public class exc8_1 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Integer> multp = new ArrayList<>();
        int num, len, smt = 0, ans = 0;
        System.out.println("Введите кол-во знаков числа в 3-ой СС: ");
        len = input.nextInt();

        while (smt != len) {
            System.out.println("Введите число в 3-ой СС (т.е. числа: 0, 1, 2): ");
            num = input.nextInt();
            if (num >= 0 & num <= 2) {
                arr.add(num);
                smt++;
            } else
                System.out.println("Числа которые могут быть (0, 1, 2)");
        }
        for (int i = len - 1; i >= 0; i--) {
            int mult = (int) (Math.pow(3, i));
            multp.add(mult);
            }
        for (int i = 0; i <= len - 1; i++) {
            for (int j = 0; j <= len - 1; j++) {
                ans += arr.get(i) * multp.get(j);
                i++;
            }
        }
        System.out.println(arr);
        System.out.println(ans);
    }
}
