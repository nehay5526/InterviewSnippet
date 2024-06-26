public class BST {
    static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data = data;
        }
    }

    public Node insert(Node node,int data){
        
        if(node == null){
            node = new Node(data);
        }else if(node.data > data){
            insert(node)
        }
        return null;
    }

    public static void main(String... args){
        List<Integer> numbers = List.of(14,8,3,6,9,2,7,1);
    }
    
}
