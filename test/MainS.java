import java.sql.*;
  
public class MainS {
    public static void main(String args[])
    {
  
        // Create two timestamp objects
        Timestamp ts1 = new Timestamp(1653302128);
        Timestamp ts2 = new Timestamp(1653302136);
  
        boolean b = ts2.before(ts1);
  
        // Check if the second timestamp occurs
        // before first timestamp
        if (b) {
  
            // If true print that the Second Timestamp
            // occurs before the first timestamp
            System.out.println("Second Timestamp occurs"
                               + " before first timestamp");
        }
  
        else {
  
            // If false print that the Second Timestamp
            // does not occur before the first timestamp
            System.out.println("Second Timestamp does not"
                               + " occur before first timestamp");
        }
    }
}
