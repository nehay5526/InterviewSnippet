
import java.util.Arrays;

public class Gen1 {
    public static void main(String... args){
        Kent k = new Kent();
        k.<String>generateMe("hello");
        k.generateMe(1);
        k.generateMe(1.2344);
        k.generateMe(Arrays.asList(1,2));

        Take<String> show = new Take<>(" showme");
        System.out.println(" show :::"+ show.getData());
        Take<Integer> inteme = new Take<>(122);
        System.out.println(" inteme :::"+inteme.getData());

      //  Give<String> go = new Give<>();
    }
    
}

class Kent{                                                                                                                                                                                                                                                                                                                                                                                                                         
    public <T> void generateMe(T data){
        System.out.println("Data :::"+data);
    }
}

class Take<T>{
    private T data;
    public Take(T data){
        this.data = data;
    }
    public T getData(){
        return data;
    }
}

class Give <T extends Number>{
    public void show(){
        System.out.println(" This is a bounded type.");
    }
}
