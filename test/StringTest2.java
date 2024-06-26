public class StringTest2 {

    public static void check(Object obj){
        System.out.println("Object");
    }
    public static void check(String str){
        System.out.println("String");
    }
    public static void check(Double str1){
        System.out.println("Integer");
    }
    public static void main(String... args){
          //  StringTest2.check("checking");
           StringTest2.check(null);
    }
}
