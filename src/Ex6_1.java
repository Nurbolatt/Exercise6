public class Ex6_1 {
    public static void main(String[] args) {
        int[] array = {1, 3, 4, 1, 5, 5};
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        double average = sum / array.length;
        System.out.println("Среднее значение = " + average);
    }
}

