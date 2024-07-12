package CollectionsFramework.Trees;

import java.util.LinkedList;
import java.util.Queue;

//Build a Tree from its Preorder traversal
public class tree {
   static class Node {
       int data;
       Node left;
       Node right;


       Node(int data) {
           this.data = data;
           this.left = null;
           this.right = null;
       }
   }

   static class BinaryTree {
       static int idx = -1;
       public Node buildTree(int nodes[]) {
           idx++;
           if(nodes[idx] == -1) {
               return null;
           }
           Node newNode = new Node(nodes[idx]); 
           newNode.left = buildTree(nodes);
           newNode.right = buildTree(nodes);
           return newNode;
       }
    }

    //tree travarsal

    //preorder
    public static void preorder(Node root) {
        if(root == null) {
            System.out.print(-1+" ");
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }

    //postorder
    public static void postorder(Node root) {
        if(root == null) {
            System.out.print(-1+" ");
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }
 
    //inorder
    public static void inorder(Node root) {
        if(root == null) {
            System.out.print(-1+" ");
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
 
 //level order
    public static void levelOrder(Node root) {
       if(root == null) {
           return;
       }
       Queue<Node> q = new LinkedList<>();
       q.add(root);
       q.add(null);
       while(!q.isEmpty()) {
           Node curr = q.remove();
           if(curr == null) {
               System.out.println();
               //queue empty
               if(q.isEmpty()) {
                   break;
               } else {
                   q.add(null);
               }
           } else {
               System.out.print(curr.data+" ");
               if(curr.left != null) {
                   q.add(curr.left);
               }
               if(curr.right != null) {
                   q.add(curr.right);
               }
           }
       }
   }

   //height of the tree
   
public static int height(Node root) {
    if(root == null) {
        return 0;
    }
    int leftHeight = height(root.left);
    int rightHeight = height(root.right);
    return Math.max(leftHeight, rightHeight) + 1;
}

//count of nodes
public static int countOfNodes(Node root) {
    if(root == null) {
        return 0;
    }
    int leftNodes = countOfNodes(root.left);
    int rightNodes = countOfNodes(root.right);
    return leftNodes + rightNodes + 1;
}

//sum of nodes
public static int sumOfNodes(Node root) {
    if(root == null) {
        return 0;
    }
    int leftSum = sumOfNodes(root.left);
    int rightSum = sumOfNodes(root.right);
    return leftSum + rightSum + root.data;
}

//diameter of tree - Approach1 O(N^2)
    public static int diameter(Node root) {
        if(root == null) {
            return 0;
        }
        int diam1 = height(root.left) + height(root.right) + 1;
        int diam2 = diameter(root.left);
        int diam3 = diameter(root.right);
        return Math.max(diam1, Math.max(diam2, diam3));
    }


    public static void main(String args[]) {
       int nodes[] = {7, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
       BinaryTree tree = new BinaryTree();
      
       Node root = tree.buildTree(nodes);
       System.out.println(root.data);

       preorder(root);
       System.out.println();
       postorder(root);
       System.out.println();
       inorder(root);
       System.out.println();
       levelOrder(root);
       System.out.println();
       int h = height(root);
       System.out.println("The height is : "+h);
       int c = countOfNodes(root);
       System.out.println("The number of node is : "+c);
       int s = sumOfNodes(root);
       System.out.println(s);
       int d = diameter(root);
       System.out.println(d);

   }
}