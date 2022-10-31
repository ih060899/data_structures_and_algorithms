package queue;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class QueueMain {
    public static void main(String[] args) {
//        Queue<Integer> queue = new ArrayDeque<>();
//        queue.add(10);
//        queue.add(20);
//        queue.add(30);
//        System.out.println(queue);
//        reverse(queue);
//        System.out.println(queue);

//        ArrayQueue queue = new ArrayQueue(5);
//        queue.enqueue(10);
//        queue.enqueue(20);
//        queue.enqueue(30);
//        int front = queue.dequeue();
//        queue.enqueue(40);
//        queue.enqueue(50);
//        queue.enqueue(60);
//        System.out.println(queue.isFull());
//        System.out.println(front);
//        System.out.println(queue);

//        QueueWithTwoStacks queue = new QueueWithTwoStacks();
//        queue.enqueue(10);
//        queue.enqueue(20);
//        queue.enqueue(30);
//        queue.dequeue();
//        queue.dequeue();
////        queue.dequeue();
//        int first = queue.dequeue();
//        System.out.println(first);

        PriorityQueue priorityQueue = new PriorityQueue();
        priorityQueue.add(56);
        priorityQueue.add(59);
        priorityQueue.add(7);
        priorityQueue.add(5);
        System.out.println(priorityQueue);
        while (!priorityQueue.isEmpty()){
            System.out.println(priorityQueue.remove());
        }
    }

    public static void reverse(Queue<Integer> queue){
        Stack<Integer> stack = new Stack<>();
        while (!queue.isEmpty()){
            stack.push(queue.remove());
        }

        while (!stack.isEmpty()){
            queue.add(stack.pop());
        }
    }
}
