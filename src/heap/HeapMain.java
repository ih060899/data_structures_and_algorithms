package heap;

import java.util.Arrays;

public class HeapMain {
    public static void main(String[] args) {
        Heap heap = new Heap();
//        heap.insert(10);
//        heap.insert(5);
//        heap.insert(17);
//        heap.insert(4);
//        heap.insert(22);
//        heap.remove();
//        int[] numbers = {5, 3, 10, 1, 4, 2};
//        for (int number: numbers) {
//            heap.insert(number);
//        }

//        for (int i = 0; i < numbers.length; i++) {
//            numbers[i] = heap.remove();
//        }
//        for (int i = numbers.length - 1; i >= 0; i--) {
//            numbers[i] = heap.remove();
//        }
//        System.out.println(Arrays.toString(numbers));

//        while (!heap.isEmpty()){
//            System.out.println(heap.remove());
//        }
        int[] numbers = {5, 3, 10, 1, 4, 2};
//        MaxHeap.heapify(numbers);
//        System.out.println(Arrays.toString(numbers));
        System.out.println(MaxHeap.getKthLargest(numbers, 9));
    }
}
