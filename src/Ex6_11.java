public class Ex6_11 {
        public static void main(String[] args) {
            int[][] arr = {{10, 20, 30}, {40, 50, 60}};
            System.out.println(isSquare(arr)); // false
        }
        public static boolean isSquare(int[][] arr) {
            int rows = arr.length;
            int cols = arr[0].length;
            return rows == cols;
        }
}


