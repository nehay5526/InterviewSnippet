import java.lang.reflect.*;
import java.io.*;

class GrandParent {
     public String toString(){
        System.out.println("hello from grandParent");
        return "hey grand parent parent";
    }
}

class Parent extends GrandParent{
    static void move()  throws IOException {
        System.out.println("move");
    }
 
}

public class Test2 extends Parent{
  
     static void move() throws IOException,IllegalArgumentException{
        System.out.println("test move");
    }
  
    public static void main(String... args) throws Exception{
        Parent p = new Test2();
        Test2 t = new Test2();
        p.move();
        t.move();
    }
}