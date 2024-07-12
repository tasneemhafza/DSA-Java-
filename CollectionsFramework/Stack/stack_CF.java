package CollectionsFramework.Stack;

import java.util.Stack;

public class stack_CF {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
    //LIFO
        stack.push("m");
        stack.push("e");
        stack.push("e");
        stack.push("n");
        stack.push("s");
        stack.push("a");
        stack.push("T");
        
        while(!stack.isEmpty()) {
            //System.out.print(stack.peek());
            System.out.print(stack.pop()); 
        }

    }
}
