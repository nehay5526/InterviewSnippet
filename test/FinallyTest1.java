class Parent{
    void a() throws Exception{
        System.out.println("parent");
    }
}
public class FinallyTest1 extends Parent{
    void a() {
        System.out.println("child");
    }
    public static void main(String[] args) throws Exception {
        Parent ft = new FinallyTest1();
        ft.a();
        //compile time error
        //  FinallyTest1 ft1 = new Parent();

}
 
}