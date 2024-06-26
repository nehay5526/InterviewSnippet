@FunctionalInterface
interface Checking{
    int setMe(int k);
}
public class FuntionalInterface {
    public static void main(String... args){
        Checking c = (x)-> x*2;
        int a =5;
        int ans = c.setMe(a);
        System.out.println(ans);
    }
    
}
