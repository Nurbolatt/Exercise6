import java.util.Arrays;
public class Ex6_8 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 0, 4, 6};
        String result = largestNumber(arr);
        System.out.println(result);
    }
    public static String largestNumber(int[] nums) {

        Integer[] sortedNums = Arrays.stream(nums)
                .boxed()
                .sorted((a, b) -> {
                    String ab = a.toString() + b.toString();
                    String ba = b.toString() + a.toString();
                    return ba.compareTo(ab);
                })
                .toArray(Integer[]::new);

        StringBuilder sb = new StringBuilder();
        for (Integer num : sortedNums) {
            sb.append(num);
        }

        int i = 0;
        while (i < sb.length() && sb.charAt(i) == '0') {
            i++;
        }
        if (i > 0 && i < sb.length()) {
            sb.insert(i, '0');
            sb.delete(0, i);
        }
        return sb.toString();
    }
}
