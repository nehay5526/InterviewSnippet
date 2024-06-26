
public class FinallyTest{
    public static void main(String[] args) {
        FinallyTest ft = new FinallyTest();
        System.out.println(ft.check());
}
 public int check(){
    try{
        int a =10%0;
        return 1;
    }catch(Exception e){
        return 2;
    }finally{
        return 3;
    }
}
}