public class Ex6_7 {
    public static void main(String[] args) {
        int[] arr = {1, 3, -6, 23, 14, 2};
        int min_element = Integer.MAX_VALUE;
        int second_min_element = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min_element) {
                second_min_element = min_element;
                min_element = arr[i];
            } else if (arr[i] < second_min_element && arr[i] != min_element) {
                second_min_element = arr[i];
            }
        }

        System.out.println("Наименьший элемент = " + min_element);
        System.out.println("Второй наименьший элемент = " + second_min_element);
    }
}

