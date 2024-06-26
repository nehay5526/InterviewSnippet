public class MainClass {
    public void getDetails(String param) {
        System.out.println("string parameter");
    }

    public void getDetails(Object param) {
        System.out.println("object parameter");
    }

    public static void main(String[] args) throws Exception {
        MainClass obj = new MainClass();
        obj.getDetails(null);
    }
}