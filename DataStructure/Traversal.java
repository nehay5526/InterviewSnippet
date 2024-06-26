import java.util.Stack;

//create node class
class Node {
    int key;
    Node left, right;

    Node(int item) {
        key = item;
        left = right = null;
    }
}

// binary tree
public class Traversal {
    Node root;

    Traversal() {
        root = null;
    }

    void MorrisTraversal(Node root) {
        Node current, pre;

        if (root == null)
            return;

        current = root;
        while (current != null) {
            if (current.left == null) {
                System.out.print(current.data + " ");
                current = current.right;
            } else {
                /*
                 * Find the inorder
                 * predecessor of current
                 */
                pre = current.left;
                while (pre.right != null
                        && pre.right != current)
                    pre = pre.right;

                /*
                 * Make current as right
                 * child of its
                 * inorder predecessor
                 */
                if (pre.right == null) {
                    pre.right = current;
                    current = current.left;
                }

                /*
                 * Revert the changes made
                 * in the 'if' part
                 * to restore the original
                 * tree i.e., fix
                 * the right child of predecessor
                 */
                else {
                    pre.right = null;
                    System.out.print(current.data + " ");
                    current = current.right;
                } /*
                   * End of if condition pre->right == NULL
                   */

            } /* End of if condition current->left == NULL */

        } /* End of while */
    }

    void inorderMStack() {
        if (root == null)
            return;
        Node current = root;
        Stack<Node> s = new Stack<>();
        while (current != null || s.size() > 0) {
            while (current != null) {
                s.push(current);
                current = current.left;
            }
            s.stream().forEach(s1 -> System.out.print(s1.key + "-"));
            current = s.pop();
            System.out.print(":" + current.key + ":");
            current = current.right;
        }
    }

    void printPost(Node node) {
        if (node == null)
            return;
        printPost(node.left);
        printPost(node.right);
        System.out.print(node.key + " ");

    }

    void printInOrder(Node node) {
        if (node == null)
            return;
        printInOrder(node.left);
        System.out.print(node.key + " ");
        printInOrder(node.right);

    }

    void printPre(Node node) {
        if (node == null)
            return;
        System.out.print(node.key + " ");
        printPre(node.left);
        printPre(node.right);

    }

    void printPostorder() {
        printPost(root);
    }

    void printInorder() {
        printInOrder(root);
    }

    void printPreorder() {
        printPre(root);
    }

    public static void main(String[] args) {
        Traversal tree = new Traversal();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println(
                "Preorder traversal of binary tree is ");
        tree.printPreorder();

        System.out.println(
                "\nInorder traversal of binary tree is ");
        tree.inorderMStack();

        System.out.println(
                "\nPostorder traversal of binary tree is ");
        tree.printPostorder();
    }
}
