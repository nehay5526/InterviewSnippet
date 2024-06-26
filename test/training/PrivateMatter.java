class Base {
public String className = "Base";
public String getClassName() {
return "Base";
}
}
class Derived extends Base {
private String className = "Derived";
public String getClassName() {
return "Derived";
}
}
public class PrivateMatter {
public static void main(String[] args) {
//System.out.println(new Derived().className);
System.out.println(new Derived().getClassName());
System.out.println(X.Y.Z);
System.out.println(Ex.Why.z);
}
}
class X {
    static class Y {
    static String Z = "Black";
    }
    static C Y = new C();
    }
class C {
    String Z = "White";
    }

class Ex {
static class Why {
static String z = "Black";
}
static See y = new See();
}
class See {
String z = "White";
}