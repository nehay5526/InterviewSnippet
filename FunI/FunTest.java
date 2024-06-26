public class FunTest {
    public static void main(String[] args){
        Square s = (i)-> i*i;
        int call = s.square(8);
        System.out.println(call); 
    }
}

@FunctionalInterface
interface Square {
    int square(int i);
}
