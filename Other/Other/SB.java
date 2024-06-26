public class SB {
    public static void main(String... args){
        Demo demo = new Demo();
        demo.call(null);
        String s = "james";
        String k = "jamesd";
        Integer j = 32;
        Integer u = 39;
        System.out.println( s.compareTo(k));
        System.out.println( j.compareTo(u));

    }
}
class Demo{
    //call string with string and object together
    public void call(String args){
        System.out.println("String");
    }
    //compilation error
    // public void call(StringBuffer sb){
    //      System.out.print("String Buffer");
    //  }
    public void call(Object sb){
        System.out.println("Object");
    }
}
