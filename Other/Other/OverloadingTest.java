package Other;

public class OverloadingTest {

    public void draw(String i){
        System.out.println(" ON String" + i);
    }
    // public void draw(Integer i){
    //     System.out.println(" ON Integer" + i);
    // }
    public void draw(Object i){
        System.out.println(" ON Object" + i);
    }
    // public void draw(Number i){
    //     System.out.println(" ON Number");
    // }

    public static void main(String... args){
        OverloadingTest test = new OverloadingTest();
        test.draw(null);
    }
    
}
