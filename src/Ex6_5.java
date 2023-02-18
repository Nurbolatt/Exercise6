import java.util.Arrays;

public class Ex6_5 {
    public static void main(String[] args) {
        int[] array = {34, 82, 29, 30, 25, 40, 32, 31, 35, 410, 7};
        int n = 3;
        int m = 8;
        int[] subArray = new int[m - n + 1];

        for (int i = n; i <= m; i++) {
            subArray[i - n] = array[i];
        }

        System.out.println(Arrays.toString(subArray));
    }
}
