class Parent{
public static final String PRIZE = "$64,000";
public static final String prize() {
return PRIZE;
}
}
public class Child extends Parent {
    static boolean decision() {
try {
return true;
} finally {
return false;
}
}
    public static final String PRIZE = "2 cents";
    public static void main(String[] args) {
        System.out.println(Child.PRIZE);
        System.out.println(decision());
        }
}


