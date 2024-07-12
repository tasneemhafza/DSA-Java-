package CollectionsFramework.LinkedList;

public class LL_scratch {
   Node head;
   private int size;
   LL_scratch () {
       size = 0;
   }

   public class Node {
       int data;
       Node next;
       Node(int data) {
           this.data = data;
           this.next = null;
           size++;
       }
   }
   

   public void addFirst(int data) {
       Node newNode = new Node(data);
       newNode.next = head;
       head = newNode;
   }

   public void addLast(int data) {
       Node newNode = new Node(data);
       if(head == null) {
           head = newNode;
           return;
       }

       Node lastNode = head;
       while(lastNode.next != null) {
           lastNode = lastNode.next;
       }
       lastNode.next = newNode;
   }

   public void printList() {
       Node currNode = head;
       while(currNode != null) {
           System.out.print(currNode.data+" -> ");
           currNode = currNode.next;
       }
       System.out.println("null");
   }


   public void removeFirst() {
       if(head == null) {
           System.out.println("Empty List, nothing to delete");
           return;
       }
       head = this.head.next;
       size--;
    }

    public void removeLast() {
        if(head == null) {
            System.out.println("Empty List, nothing to delete");
            return;
        }
        size--;
        if(head.next == null) {
            head = null;
            return;
        }
        Node currNode = head;
        Node lastNode = head.next;
        while(lastNode.next != null) { 
            currNode = currNode.next;
            lastNode = lastNode.next;
        }
        currNode.next = null;
    }
 
 
    public int getSize() {
        return size;
    }

    //Reverse list ->iterative method
    public void reverseList() {
        if(head==null || head.next == null) {
            return;
        }

        Node prev = head;
        Node curr = head.next;
        while(curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr =next;
        }
        head.next = null;
        head = prev;
    }

    //Recursive Approach
    public Node reverseListRecursive(Node head) {
        //empty node || last node or only one node
        if(head == null || head.next == null) {
            return head;
        }
        Node newHead = reverseListRecursive(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }
 
    public static void main(String args[]) {

        LL_scratch list = new LL_scratch();
        list.addLast(4);
        list.addLast(5);
        list.addLast(8);
        //list.printList();
        list.addFirst(2);
        list.printList();
        System.out.println(list.getSize());
 
        //list.removeFirst();
        //list.printList();
        //list.removeLast();
        //list.printList();

        list.reverseList();
        list.printList();
        //Node head =list.reverseListRecursive(head);  //some problem
    
    }
 
 }
