public class DFS_preorder {
  public static void main(String[] args) {
    Node binaryTree = new Node(50);
    Node curr = binaryTree;

    curr.left = new Node(21);
    curr.right = new Node(30);

    curr = curr.left;

    curr.left = new Node(80);

    curr = binaryTree.right;

    curr.left = new Node(40);

    curr = curr.left;

    curr.right = new Node(60);

    preorder(binaryTree);
  }

  public static void preorder(Node root) {
    if (root.left == null && root.right == null) {
      System.out.println(root.val);
      return;
    }

    System.out.println(root.val);
    if (root.left != null) preorder(root.left);
    if (root.right != null) preorder(root.right);
  }
}

class Node {
  int val;
  Node left = null;
  Node right = null;

  Node() {
    this(0);
  }

  Node(int x) {
    val = x;
  }
}