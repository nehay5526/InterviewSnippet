public class MethodRef {
    public void m1(String checkme){
        checkme = "hi update me";
    }
    public static void main(String... args){
        MethodRef mf = new MethodRef();
        String hicheck ="check me";
        mf.m1(hicheck);
        System.out.println(hicheck);
    }
    
}
