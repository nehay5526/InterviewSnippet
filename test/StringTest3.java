public class StringTest3 {
 public static void check(NullPointerException str){
        System.out.println("NullPointerException");
    }
     public static void check(ArithmeticException str){
        System.out.println("ArithmeticException");
    }
    public static void check(Exception obj){
        System.out.println("Exception");
    }
    public static void check(Object str){
        System.out.println("Object");
    }
    public static void main(String... args) {
           StringTest3.check("Object");
           StringTest3.check(null);

    }
}
