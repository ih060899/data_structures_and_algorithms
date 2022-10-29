package linklist;

import java.util.Arrays;

public class LinkListMain {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
//        list.addLast(10);
//        list.addLast(20);
//        list.addLast(30);
//        list.addLast(40);
//        list.addLast(50);
//        list.removeFirst();
//        list.removeLast();
//        System.out.println(list.size());
//        System.out.println(list.indexOf(30));
//        System.out.println(list.contains(40));
//        list.reverse();
//        int[] array = list.toArray();
//        System.out.println(Arrays.toString(array));
        System.out.println(list.getKthFromTheEnd(0));
    }
}
