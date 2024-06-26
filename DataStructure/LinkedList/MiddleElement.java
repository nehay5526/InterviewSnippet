import java.util.*;
public class MiddleElement {
    public class Node {
    Node next;
    String data;
    Node(Node next,String data){
        this.next = next;
        this.data = data;
    }   

}
 Node add(Node node,String data){
        if(null==node){
            return new Node(null,data);
        }
        return node.next = new Node(null,data);
    }
    static void show(Node node){
        System.out.println("Called");
        if(null==node){
                    System.out.println("null");

            return;
        }
        while(node.next!=null){
                                System.out.println("null");

            System.out.println(node.data);
        }
    }
public static void main(String... args){
    MiddleElement middleElement = new MiddleElement();
    List<String> str = List.of("a","b","c","d","e","f","g","h");
    Node node = null;
    for(String str1:str){
       node = middleElement.add(node,str1);
    }
    show(node);
}
}



