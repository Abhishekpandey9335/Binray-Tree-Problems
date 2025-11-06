
public class Preorder {
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

    }

    public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,6,-1,-1};
        BinrayTree tree = new BinrayTree();
        Node root = tree.buildTree(nodes);
        tree.preOrder(root);

    }
}