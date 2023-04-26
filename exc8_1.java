import java.util.ArrayList;
import java.util.Scanner;

public class exc8_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        int num, len, smt = 0, ans = 0;
        System.out.println("Введите кол-во знаков числа в 3-ой СС: ");
        len = input.nextInt();

        while (smt != len) {
            System.out.print("Введите число в 3-ой СС (т.е. числа: 0, 1, 2): ");
            num = input.nextInt();
            if (num >= 0 && num <= 2) {
                arr.add(num);
                smt++;
            } else {
                System.out.println("Числа которые могут быть (0, 1, 2)");
            }
        }

        System.out.print("Массив: ");
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i) + " ");
        }
        System.out.println();

        for (int i = 0; i < arr.size(); i++) {
            int pow = len - 1 - i;
            int digit = arr.get(i);
            if (digit < 0 || digit > 2) {
                System.out.println("Введено некорректное значение.");
                return;
            }
            ans += digit * Math.pow(3, pow);
        }

        System.out.println("Результат перевода: " + ans);
    }
}

