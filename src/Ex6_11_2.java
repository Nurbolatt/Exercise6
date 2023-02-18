public class Ex6_11_2 {
    public static void main(String[] args) {
        int[][] arr = {{10, 20}, {40, 50}};
        boolean isSquare = true;
        for (int i = 0; i < arr.length; i++) {
            if (arr.length != arr[i].length) {
                isSquare = false;
                break;
            }
        }
        System.out.println(isSquare);
    }
}




