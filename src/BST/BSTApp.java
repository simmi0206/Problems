package BST;

class Node{
    int data;
    Node left;
    Node right;
}
class BST {

    Node insert(Node node, int value) {
        if (node == null) {
            return createNewNode(value);
        }
        if (value < node.data) {
            node.left = insert(node.left, value);
        } else if (value > node.data) {
            node.right = insert(node.right, value);
        }

        return node;
    }

    private Node createNewNode(int value) {
        Node node = new Node();
        node.data = value;
        node.left = null;
        node.right = null;
        return node;
    }

    public Node delete(Node node, int val) {
        if (node == null) {
            return null;
        }
        if (val < node.data) {
            node.left = delete(node.left, val);
        } else if (val > node.data) {
            node.right = delete(node.right, val);
        } else if (node.left == null || node.right == null) {
            Node temp = null;
            temp = node.left == null ? node.right : node.left;

            if (temp == null) {
                return null;
            } else {
                return temp;
            }
        } else {
            Node successor = getSuccesor(node);
            node.data = successor.data;
            node.right = delete(node.right, 4);
            return node;
        }
        return node;
    }

    private Node getSuccesor(Node node) {
        if (node == null) {
            return null;
        }
        Node temp = node.right;
        if (temp != null) {
            temp = temp.left;
        }
        return temp;
    }


    public void print(Node root) {

    }
    public Node printInorder(Node node) {
        if(node==null)
        {
            return  null;
        }
        printInorder(node.left);
        System.out.print(" "+node.data);
        printInorder(node.right);
        return node;
    }

    public Node printPostOrder(Node node) {
        //left right root
        if(node==null)
        {
            return null;
        }
        printPostOrder(node.left);
        printPostOrder(node.right);
        System.out.print(" "+node.data);
        return node;
    }

    public Node printPreOrder(Node node) {
        //root left right
        if(node==null)
        {
            return null;
        }
        System.out.print(" "+node.data);
        printPreOrder(node.left);
        printPreOrder(node.right);
        return node;
    }

    public boolean checkIfNodePresent(Node node, int val) {
        if(node==null)
        {
            return false;
        }

        if(val==node.data)
        {
            return true;
        }

        if(val<node.data)
        {
            return checkIfNodePresent(node.left,val);
        }else{
            return checkIfNodePresent(node.right,val);
        }

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
        //root= bst.delete(root,3);
        //root=bst.printInorder(root);
        //root=bst.printPreOrder(root);
        //root=bst.printPostOrder(root);
//        int val=18;
//        boolean status=bst.checkIfNodePresent(root, val);
//        if(status)
//        {
//            System.out.println("Value "+ val+" exists in Tree");
//        }else {
//            System.out.println("Value " + val+" does not exists in Tree");
//        }

        bst.print(root);
    }

}

