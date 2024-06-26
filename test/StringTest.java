import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StringTest {

    public static void check(Object obj){
        System.out.println("Object");
    }
    public static void check(String str){
        System.out.println("String");
    }
    public static void check(Integer str){
        System.out.println("Integer");
    }
    public static void main(String... args){
            StringTest.check("checking");
            StringTest.check(null);
             if(null==null){
                System.out.println("Null==Null");
             }
             String name = null;
             if(name.equals(null)){
                System.out.println("xyz is corrct.");
             }
            
    }
    
}
