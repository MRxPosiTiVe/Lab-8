import java.util.Scanner;

public class exc8_7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите размерность матрицы NxN: ");
        int n = input.nextInt();

        int[][] matrix = new int[n][n];

        int value = 1;

        for (int j = matrix.length; j >= 0; j--) {

            for (int i = matrix.length - j; i < j; i++) matrix[matrix.length - j][i] = value++;

            for (int i = matrix.length - j + 1; i < j; i++) matrix[i][j - 1] = value++;

            for (int i = matrix.length - j + 1; i < j; i++) matrix[i][matrix.length - j] = value++;

            for (int i = matrix.length - j + 2; i < j; i++) matrix[j - 1][i - 1] = value++;
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(String.format("%3.0f", (double) matrix[i][j])  + " ");
            }
            System.out.println();
        }
    }
}
