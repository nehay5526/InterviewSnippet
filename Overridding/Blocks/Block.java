 class Parent {
     {
                 System.out.println("Hello,i am init Block parent");

     }
static
{
     System.out.println("Static block runs parent ");
}
 void show(){
        System.out.println("Hello");
 }
}

public class Block extends Parent{ 
    {
        System.out.println("Hello,i am init Block child");

}
{
    System.out.println("Hello,i am init Block child");

}
static
{
System.out.println("Static block runs chikd ");
}
static
{
System.out.println("Static block runs chikd ");
}
Block(){
    System.out.println("default chikd ");

}
Block(int i){
    this();
    System.out.println("param chikd ");

}
    public static void main(String... args){
        System.out.println("Hello");
        Block b= new Block(1);
    }
}