public class Ex6_3 {
    public static void main(String[] args) {
        int[] array = {1, 3, -6, 23, 14, 2};
        int x = 23;
        boolean X = false;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == x) {
                X = true;
                break;
            }
        }
        System.out.println(X);

        System.out.println("-------------------");//2 example

        int[] arraay = {1, 3, -6, 23, 14, 2};
        int a = 0;
        boolean Y = false;

        for (int i = 0; i < arraay.length; i++) {
            if (arraay[i] == a) {
               Y = true;
                break;
            }
        }

        System.out.println(Y);
    }
}