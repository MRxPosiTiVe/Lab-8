import java.util.Arrays;
import java.util.Scanner;

public class exc8_5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Сколько строк в матрице? ");
        int line = input.nextInt();
        System.out.println("Сколько столбцов в матрице? ");
        int column = input.nextInt();

        int[][] arr = new int[line][column];
        int[] gawno = {Integer.MAX_VALUE, Integer.MIN_VALUE, -1, -1};

        while (true) {
            for (int i = 0; i < line; i++) {
                for (int j = 0; j < column; j++) {
                    arr[i][j] = (int) (Math.random() * (100 - 10)) + 10;
                }
            }
            for (int i = 0; i < line; i++) System.out.println(Arrays.toString(arr[i]));

            for (int i = 0; i < line; i++) {
                for (int j = 0; j < column; j++) {
                    if (gawno[0] > arr[i][j]) {
                        gawno[0] = arr[i][j];
                        gawno[2] = i;
                    }
                    if (gawno[1] < arr[i][j]) {
                        gawno[1] = arr[i][j];
                        gawno[3] = i;
                    }
                }
            }
            if (gawno[2] == gawno[3]) System.out.println("Gawno");
            else {
                int[] smt = arr[gawno[2]];
                arr[gawno[2]] = arr[gawno[3]];
                arr[gawno[3]] = smt;
                System.out.println();
                for (int i = 0; i < line; i++) System.out.println(Arrays.toString(arr[i]));
                break;
            }
        }
    }
}
