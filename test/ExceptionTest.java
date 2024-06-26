public class ExceptionTest {

    void check(){
        try{
            throw new RuntimeException(" test exception");
        }catch(Exception e){
            if(e instanceof RuntimeException)
            System.out.println(e.getMessage());
        else
            e.printStackTrace();
        throw e;
        }
    }
    public static void main(String... args){
        System.out.println(" hello world");
        ExceptionTest exceptionTest = new ExceptionTest();
        exceptionTest.check();
    }
    
}
