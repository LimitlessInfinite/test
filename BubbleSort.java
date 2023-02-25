package Practice.Base;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {1, 6, 8, 4, 89, 2, 5, 7, 9, 0, 1, 2, 4, 5, 2};
        int helpInt = args.length;

        boolean swap = false;
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length-i; j++) {
                int current = array[j-1];
                int next = array[j];
                if (current > next) {
                    array[j-1] = next;
                    array[j] = current;
                    swap = true;
                }
            }
            if (!swap) {
                break;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
