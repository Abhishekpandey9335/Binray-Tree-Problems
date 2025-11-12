package BinraySearchTree;

public class SearchBST {
    // make a static class
    static class Node {
        int data;
        Node left;
        Node right;

        //make a constructor
        Node(int data) {
            this.data = data;
        }
    }
    // make insert function
    public static Node insert(Node root , int val){
        if(root == null){
            root = new Node(val);
            return root;
        }
        if(root.data>val){
            // left SubTree
            root.left = insert(root.left,val);
        }
        else{
            root.right = insert(root.right, val);
        }
        return root;
    }
    // make inorder fxn
    public static void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public static boolean search(Node root , int key){
        if(root == null){
            return false;

        }
        if(root.data== key){
            return false;

        }
        if(root.data > key){
            return search(root.left, key);
        }
        else{
            return search(root.right, key);
        }
    }


    public static void main(String[] args) {
        int values[]={5,1,3,4,2,7};
        Node root= null;
        // for traversing all element taking a for loop
        for(int i =0; i<values.length;i++){
            root = insert(root, values[i]);
        }
        inorder(root);
        System.out.println();
        if(search(root, 6)){
            System.out.println("found");
        } else{
            System.out.println("not found");
        }
    }
}
