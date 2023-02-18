import java.util.*;

public class Ex6_2 {
    public static void main(String[] args) {
        int[] array = {1, 3, 4, 1, 5, 5};
        Set<Integer> duplicates = new HashSet<>();
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < array.length; i++) {
            if (!set.add(array[i])) {
                duplicates.add(array[i]);
            }
        }

        System.out.print("Дубликаты = ");
        for (int d : duplicates) {
            System.out.print(d + ", ");
        }
    }
}
