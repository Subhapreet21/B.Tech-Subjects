public class BinarySearchTree {
    static class Node{
        int key;
        Node left, right;
        public Node(int item){
            key=item;
            left=right=null;
        }
    }
    Node root;
    BinarySearchTree(){
        root=null;
    }
    BinarySearchTree(int value){
        root = new Node(value);
    }
    void insert(int key){
        root=insertRec(root,key);
    }
    Node insertRec(Node root, int key){
        if (root==null){
            root=new Node(key);
            return root;
        }
        else if(key<root.key){
            root.left=insertRec(root.left,key);
        }
        else if(key>root.key){
            root.right=insertRec(root.right,key);
        }
        return root;
    }
    void inorder(){
        inorderRec(root);
    }
    void inorderRec(Node root){
        if(root!=null){
            inorderRec(root.left);
            System.out.print(root.key+" ");
            inorderRec(root.right);
        }
    }

    public static void main(String[] args) {
        BinarySearchTree t = new BinarySearchTree();
        t.insert(50);
        t.insert(30);
        t.insert(20);
        t.insert(40);
        t.insert(70);
        t.insert(60);
        t.insert(80);
        t.inorder();
    }
}
