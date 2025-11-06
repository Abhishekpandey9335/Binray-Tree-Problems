
public class Main {
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

    }

    public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,6,-1,-1};
        BinrayTree tree = new BinrayTree();
        Node root = tree.buildTree(nodes);
        System.out.println(root.data);

    }
}