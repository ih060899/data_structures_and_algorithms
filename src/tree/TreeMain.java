package tree;

import java.util.List;

public class TreeMain {
    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.insert(7);
        tree.insert(4);
        tree.insert(3);
        tree.insert(6);
        tree.insert(9);
        tree.insert(1);
        tree.insert(6);
        tree.insert(8);
        tree.insert(10);
        tree.insert(6);
        tree.insert(11);
        tree.insert(56);

        Tree tree1 = new Tree();
        tree1.insert(7);
        tree1.insert(4);
        tree1.insert(5);
        tree1.insert(9);
        tree1.insert(1);
        tree1.insert(10);
        tree1.insert(8);
        tree1.insert(6);
        tree1.insert(7);
//        tree1.insert(56);

//        System.out.println(tree.find(8));
//        tree.traversePostOrder();
//        System.out.println(tree.height());
//        System.out.println(tree.min());
//        System.out.println(tree.equals(tree1));
//        tree.swapRoot();
//        System.out.println(tree.isBinarySearchTree());
//        List<Integer> list = tree.printNodesAtDistance(2);
        tree.traverseLevelOrder();
    }
}
