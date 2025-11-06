import java.util.*;
public class LevelOrderTraversal {
    //make a node class
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;

        }
    }
    // make a binary tree class
    static class BinrayTree {
        static int idx = -1;//for updataion from starting
        public static Node buildTree(int nodes[]){
            idx ++;
            if(nodes[idx]==-1){
                return null ;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);//formation of left Node
            newNode.right=buildTree(nodes);//formation of right node
            return newNode;
        }
        //making preorder
        public static void preOrder(Node root){
            if(root == null){
                return ;
                // System.out.println("-1");
                //return;

            }
            System.out.print(root.data+" ");
            preOrder(root.left);
            preOrder(root.right);
        }
        public static void inOrder(Node root){
            if(root == null){
                return;

            }
            inOrder(root.left);
            System.out.println(root.data + " ");
            inOrder(root.right);

        }
        public static void postOrder(Node root){
            if(root == null){
                return;

            }
            postOrder(root.left);
            postOrder(root.right);
            System.out.println(root.data + " ");

        }
        public static void levelOrder(Node root){
            if(root == null){
                return;
            }
            // for BFS implements Queue
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);

            while(!q.isEmpty()){
                Node currNode = q.remove();
                if(currNode == null){
                    System.out.println();
                    if(q.isEmpty()){
                        break;
                    }else{
                        q.add(null);
                    }
                } else {
                    System.out.print(currNode.data+" ");
                    if(currNode.left != null){
                        q.add(currNode.left);

                    }
                    if(currNode.right != null){
                        q.add(currNode.right);
                    }
                }

            }

        }



    }

    public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,6,-1,-1};
        BinrayTree tree = new BinrayTree();
        Node root = tree.buildTree(nodes);
        // tree.preOrder(root);
        //tree.inOrder(root);
        tree.levelOrder(root);

    }
}