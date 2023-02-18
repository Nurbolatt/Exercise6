public class Ex6_9 {
    public static void main(String[] args) {
        int[][] arr = {{10, 20, 30}, {40, 50, 60}};
        int[][] transposed = transpose(arr);
        printArray(transposed);
    }

    public static int[][] transpose(int[][] arr) {
        int[][] transposed = new int[arr[0].length][arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                transposed[j][i] = arr[i][j];
            }
        }
        return transposed;
    }
    public static void printArray(int[][] arr) {
        for (int[] row : arr) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        System.out.println("-----------------------");//ex2
        int[][] arrays = {{4, 2, 1}, {2, 7, 2}};

        int rows = arrays.length;
        int cols = arrays[0].length;

        int[][] transposedArr = new int[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposedArr[j][i] = arrays[i][j];
            }
        }
        System.out.println("После изменения строк и столбцов указанного массива");
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(transposedArr[i][j] + " ");
            }
            System.out.println();
        }
    }
}


