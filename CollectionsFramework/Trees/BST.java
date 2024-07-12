package CollectionsFramework.Trees;

public class BST {
    static class node {
        int data;
        node left;
        node right;

        node(int data) {
            this.data=data;
        }
    }

    public static node insert(node root, int val) {
        if(root==null) {
            root=new node(val);
            return root;
        }
        else if (root.data>val) { 
            root.left= insert(root.left, val); //left subtree
        }
        else { 
            root.right=insert(root.right, val); //left subtree
        }
        return root;
    }
    public static void main(String[] args) {
        int value[] = {5,1,3,4,2,7};
        node root=null;
        for(int i=0; i<value.length; i++) {
        root= insert(root, i);
        }        
    }
}
