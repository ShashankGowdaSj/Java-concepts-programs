package Day12;

class Node2{
    int data;
    Node2 left, right;

    Node2(int data){
        this.data = data;
        left = null;
        right = null;
    }
}

public class Binarytree{

    static Node2 createBinaryTree(int val){
        return new Node2(val);
    }

    static void inorder(Node2 root){
        if(root == null){
            return;
        }

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }
    static void preorder(Node2 root){
        if(root == null){
            return;
        }


        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }
    static void postorder(Node2 root){
        if(root == null){
            return;
        }


        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");

    }

    public static void main(String args[]){

        Node2 root = createBinaryTree(10);

        root.left = createBinaryTree(5);
        root.right = createBinaryTree(15);

        root.left.left = createBinaryTree(5);
        root.left.right = createBinaryTree(15);

        root.right.left = createBinaryTree(5);
        root.right.right = createBinaryTree(15);
        System.out.println("Inorder:");
        inorder(root);
        System.out.println();
        System.out.println("Postorder:");
        postorder(root);
        System.out.println();
        System.out.println("preorder:");
        preorder(root);
    }
}