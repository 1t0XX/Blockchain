import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        int elementsInRow = scanner.nextInt();
        int[][] matrix = new int[rows][elementsInRow];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < elementsInRow; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        int index1 = scanner.nextInt();
        int index2 = scanner.nextInt();

        int[][] newMatrix = new int[rows][elementsInRow];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < elementsInRow; j++) {
                if (j == index1) {
                    newMatrix[i][j] = matrix[i][index2];
                } else if (j == index2) {
                    newMatrix[i][j] = matrix[i][index1];
                } else {
                    newMatrix[i][j] = matrix[i][j];
                }
                System.out.printf("%d ", newMatrix[i][j]);
            }
            System.out.println();
        }
    }
}