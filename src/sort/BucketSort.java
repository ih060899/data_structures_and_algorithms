package sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BucketSort {
    public static void main(String[] args) {
        BucketSort sorter = new BucketSort();
        int[] numbers = {7, 3, 1, 4, 6, 2, 3};
        sorter.sort(numbers, 3);
        System.out.println(Arrays.toString(numbers));
    }

    public void sort(int[] array, int numberOfBuckets) {
        List<List<Integer>> buckets = createBucket(array, numberOfBuckets);
        int i = 0;
        for (List<Integer> bucket: buckets){
            Collections.sort(bucket);
            for(int item: bucket) {
                array[i++] = item;
            }
        }
    }

    private static List<List<Integer>> createBucket(int[] array, int numberOfBuckets) {
        List<List<Integer>> buckets = new ArrayList<>();
        for (int i = 0; i < numberOfBuckets; i++) {
            buckets.add(new ArrayList<>());
        }
        for (int item : array) {
            buckets.get(item / numberOfBuckets).add(item);
        }
        return buckets;
    }
}
