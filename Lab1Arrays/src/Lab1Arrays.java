public class Lab1Arrays {

    public static void main(String[] args) {
        try {
            int rows = 3;
            int cols = 4;

            long[][] matrix = {
                    {5, 12, 7, 3},
                    {8, 2, 10, 9},
                    {6, 4, 1, 11}
            };

            System.out.println("Початкова матриця:");
            printMatrix(matrix);

            long[][] transposed = new long[cols][rows];

            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    transposed[j][i] = matrix[i][j];
                }
            }

            System.out.println("\nТранспонована матриця:");
            printMatrix(transposed);

            long sum = 0;

            for (int j = 0; j < rows; j++) {
                long min = transposed[0][j];

                for (int i = 1; i < cols; i++) {
                    if (transposed[i][j] < min) {
                        min = transposed[i][j];
                    }
                }

                sum += min;
            }

            System.out.println("\nСума мінімальних елементів кожного стовпця: " + sum);

        } catch (Exception e) {
            System.out.println("Сталася помилка під час виконання програми:");
            e.printStackTrace();
        }
    }

    private static void printMatrix(long[][] matrix) {
        for (long[] row : matrix) {
            for (long element : row) {
                System.out.printf("%5d ", element);
            }
            System.out.println();
        }
    }
}
