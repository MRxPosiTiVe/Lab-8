import java.util.Scanner;

public class exc8_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("введите количество точек");
        int N = input.nextInt();
        int[] coordinates = new int[2 * N];
        for (int i = 0; i < 2 * N; i++) {
            if (i % 2 == 0) {
                System.out.println("Введите x точки " + ((i / 2) + 1));
            } else {
                System.out.println("Введите y точки " + ((i / 2) + 1));
            }
            coordinates[i] = input.nextInt();
        }


        for (int i = 0; i < (2 * N - 4); i += 2) {
            for (int j = i + 2; j < (2 * N - 3); j += 2) {
                for (int k = j + 2; k < (2 * N - 2); k += 2) {
                    for (int l = k + 2; l < (2 * N - 1); l += 2) {
                        if (((coordinates[i] == coordinates[j]) & (coordinates[k] == coordinates[l]) & (coordinates[i + 1] == coordinates[l + 1]) & (coordinates[j + 1] == coordinates[k + 1])) ||
                                ((coordinates[i] == coordinates[l]) & (coordinates[k] == coordinates[l]) & (coordinates[i + 1] == coordinates[j + 1]) & (coordinates[l + 1] == coordinates[k + 1])) ||
                                ((coordinates[i] == coordinates[l]) & (coordinates[k] == coordinates[j]) & (coordinates[i + 1] == coordinates[k + 1]) & (coordinates[j + 1] == coordinates[l + 1]))) {
                            System.out.println("Точки с координатами " + "(" + coordinates[i] + ";" + coordinates[i + 1] + "), (" + coordinates[j] + ";" + coordinates[j + 1] + "), ("
                                    + coordinates[k] + ";" + coordinates[k + 1] + "), (" + coordinates[l] + ";" + coordinates[l + 1] + ") являются вершинами прямоугольника");
                        }
                    }
                }
            }
        }
    }
}
