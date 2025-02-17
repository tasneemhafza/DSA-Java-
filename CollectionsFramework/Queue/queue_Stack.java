package CollectionsFramework.Queue;

import java.util.Stack;

public class queue_Stack {

    static Stack<Integer> s1 = new Stack<>();
    static Stack<Integer> s2 = new Stack<>();

    public boolean isEmpty() {
        return s1.isEmpty();
    }

    public void add(int data) {
        while (!s1.isEmpty()) {
            s2.push(s1.pop());
        }
        s1.push(data);
        while (!s2.isEmpty()) {
            s1.push(s2.pop());
        }
    }

    public int remove() {
        return s1.pop();
    }

    public int peek() {
        return s1.peek();
    }

    public static void main(String args[]) {
        queue_Stack q = new queue_Stack(); // Corrected instance creation
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
