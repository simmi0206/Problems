package BST;

class Node{
    int data;
    Node left;
    Node right;
}
class BST{

    Node insert(Node node, int value){
        if(node==null)
        {
            return createNewNode(value);
        }
        if(value<node.data)
        {
            node.left=insert(node.left,value);
        } else if (value>node.data) {
            node.right=insert(node.right,value);
        }

        return node;
    }

    private Node createNewNode(int value) {
        Node node=new Node();
        node.data=value;
        node.left=null;
        node.right=null;
        return node;
    }


    public void print(Node root) {

    }
}

public class BSTApp {
    public static void main(String[] args) {
        BST bst=new BST();
        Node root=null;
        root = bst.insert(root,8);
        root = bst.insert(root,3);
        root = bst.insert(root,10);
        root = bst.insert(root,1);
        root = bst.insert(root,6);
        root = bst.insert(root,4);
        root = bst.insert(root,7);
        root = bst.insert(root,3);
        root = bst.insert(root,14);
        root = bst.insert(root,13);

        bst.print(root);
    }

}
