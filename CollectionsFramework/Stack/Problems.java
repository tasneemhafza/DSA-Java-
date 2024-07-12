package CollectionsFramework.Stack;
import java.util.Stack;

public class Problems {
    //To push an element at bottom of a stack
    public static void pushAtBottom(Stack<Integer> s, int data) {
        if(s.isEmpty()) {
            s.push(data);
            return;
        } else {
        int temp = s.pop();
        pushAtBottom(s, data);
        s.push(temp);
        }
    }

    //To reverse a stack
    public static void reverse(Stack<Integer> s) {
        if(s.isEmpty()) {
            System.out.println("Empty stack!");
            return;
        }
        int top = s.pop();
        reverse(s);
        pushAtBottom(s, top);
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(3); // 4th element
        s.push(2); // 3rd element
        s.push(1); // 2nd element
        s.push(4); //-->1st element
        pushAtBottom(s, 0); //-->last element

        //reverse(s); //--> 0, 3, 2, 1, 4
        while(!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }
}
