import java.util.Arrays;

import javax.print.DocFlavor.STRING;

class TestEnum{
    public static void main(String... args){
        System.out.println(Math.min(Double.MIN_VALUE, 0.0d));
        System.out.println(Math.min(Integer.MIN_VALUE, 0));
        char[] chars = new char[] {'\u0097'};
        String str = new String(chars);
        byte[] bytes = str.getBytes();
        System.out.println(Arrays.toString(bytes));

    }
}