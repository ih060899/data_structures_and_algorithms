package sort;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        InsertionSort sorter = new InsertionSort();
        int[] numbers = {7, 3, 1, 4, 6, 2, 3};
        sorter.sort(numbers);
        System.out.println(Arrays.toString(numbers));
    }

    public void sort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int current = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > current) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = current;
        }
    }
}
