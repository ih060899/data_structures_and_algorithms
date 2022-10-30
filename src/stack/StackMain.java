package stack;

public class StackMain {
    public static void main(String[] args) {
//        StringReverser reverser = new StringReverser();
//        System.out.println(reverser.reverse("abcd"));
//        Expression exp = new Expression();
//        System.out.println(exp.isBalanced("({1 + 2}]"));

        Stack stack = new Stack();
//        stack.pop();
        stack.push(78);
        stack.push( 56);
        stack.push(10);
        stack.pop();
        System.out.println(stack);
        System.out.println(stack.peek());
    }
}
