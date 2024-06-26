

// Program to demonstrate get() method 
// of Calendar class 
  
import java.util.*; 
public class Calender2 { 
    public static void main(String[] args) 
    { 
        // creating Calendar object 
        Calendar calendar = Calendar.getInstance(); 
          
        // Demonstrate Calendar's get()method 
        System.out.println("Current Calendar's Date: " + calendar.get(Calendar.DATE)); 
        calendar.add(Calendar.DATE,-(calendar.get(Calendar.DAY_OF_WEEK)+6));
        System.out.println("Current Calendar's Last sunday: " + calendar.getTime()); 
        calendar = Calendar.getInstance();
        calendar.add(Calendar.DATE,-(calendar.get(Calendar.DAY_OF_WEEK)-1));
        System.out.println("Current Calendar's Current sunday: " +calendar.getTime()); 
       
    } 
} 
