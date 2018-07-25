import java.util.Arrays;

public class ArrayTaskSS {
    public static void main(String[] args) {
        int[] array = {3, 5, 8, 11, 15, 17, 20};
        //3, 5, 8, 11, 15, 17, 20
        //20, 15, 8, 3, 5, 11, 17

        //3, 5, 8, 11, 15, 17
        //17, 11, 5, 3, 8, 15
        int[] result = new int[array.length];
        Arrays.sort(array);
        if (array.length % 2 != 0) {
            int k = array.length / 2 + 1;
            for (int i = 1; i < array.length; i = i + 2) {
                result[k++] = array[i];
            }
            for (int i = 0; i <= array.length / 2; i++) {
                result[array.length / 2 - i] = array[i * 2];
            }
        } else {
            int k = array.length / 2;
            for (int i = 0; i < array.length; i = i + 2) {
                result[k++] = array[i];
            }

            for (int i = 0; i < array.length / 2; i++) {
                result[i] = array[k - 1];
                k = k - 2;
            }
        }
        System.out.println(Arrays.toString(result));
    }
}


