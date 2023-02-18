public class Ex6_6 {
    public static void main(String[] args) {
        int[] array = {1, 3, -6, 23, 14, 2};
        int min = array[0];
        int max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            } else if (array[i] > max) {
                max = array[i];
            }
        }

        System.out.println("Минимальный элемент = " + min);
        System.out.println("Максимальный элемент = " + max);
    }
}
