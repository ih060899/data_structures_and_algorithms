package sort;

import java.util.Arrays;

public class CountSort {
    public static void main(String[] args) {
        CountSort sorter = new CountSort();
        int[] numbers = {7, 3, 1, 4, 6, 2, 3};
        sorter.sort(numbers, 7);
        System.out.println(Arrays.toString(numbers));
    }

    public void sort(int[] array, int max){
        int[] count = new int[max + 1];
        for (int item: array) {
            count[item]++;
        }
        int k = 0;
        for (int i = 0; i < count.length; i++) {
            for (int j = 0; j < count[i]; j++) {
                array[k++] = i;
            }
        }
    }
}
