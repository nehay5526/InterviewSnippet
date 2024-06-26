import java.lang.reflect.*;

class GrandParent {
     public String toString(){
        System.out.println("hello from grandParent");
        return "hey grand parent parent";
    }
}

class Parent extends GrandParent{
    public void move() {
        System.out.println("move");
    }
 
    protected void eat() {
        System.out.println("eat");
    }

    void def() {
        System.out.println("def");
    }

    // static void pri() {
    //     System.out.println("eat");
    // }
    // priavte void pri() {
    //     System.out.println("eat");
    // }
    Parent par(){
        super.toString();
        System.out.println("parent");
        return null;
    }
    public String toString(){
        System.out.println("hello parent");
        return "hey parent";
    }
    public String toString(int i){
    System.out.println("i have entered :" + i);
        return "hey parent";
    }
}

public class Test extends Parent{
    // public void move(int i ) {
    //     System.out.println("test move");
    // }
 
    public String toString(){
        System.out.println("hello child");
        return "hey  child";
    }
    public void move() {
        System.out.println("test move");
    }
    protected void eat() {
        System.out.println("test eat");
    }

    void def() {
        System.out.println("test def");
    }

    // static void pri() {
    //     System.out.println("eat");
    // }

    Test par(){
        super.par();
        System.out.println("Test");
        return null;
    }
    public static void main(String... args) throws Exception{
        Parent p = new Test();
        // p.getClass()
        // .getSuperclass()
        // .getMethod("move", new Class[]{} )
        // .invoke(p.getClass().getSuperclass().newInstance() ,new Object[]{}) ;
   

        Test t = new Test();
        p.move();
        p.eat();
        p.def();
        //p.pri();
        //p.super().par(); 
        t.move();
        t.eat();
        t.def();
        //t.pri();
        t.par();
        System.out.println(t.toString());
        System.out.println(p.toString());
        t.toString(1);
    }
}