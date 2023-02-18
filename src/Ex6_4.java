public class Ex6_4 {
    public static void main(String[] args) {
        int[] array = {1, 3, -6, 23, 14, 2};
        int x = 23;
        int index = -1;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == x) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            System.out.println("Индекс = " + index);
        }
        System.out.println("-------------------"); //2

        int[] arraay = {1, 3, -6, 23, 14, 2};
        int y = 5;
        int in = -1;

        for (int i = 0; i < arraay.length; i++) {
            if (arraay[i] == y) {
                in = i;
                break;
            }
        }

        if (in == -1) {
            System.out.println("Не найдено");
        }
    }
}




