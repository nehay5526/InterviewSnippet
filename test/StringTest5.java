public class StringTest5 {
    public final int value = 4;
	public void doIt()
	{
		int value = 6;
		Runnable r = new Runnable(){
			public final int value = 5;
			public void run(){
				int value = 10;
				System.out.println(this.value);
			}
		};
		r.run(); 
	}
    public static void main(String... args){
        String s1 = "abc";
        String s2 = s1;
        s1 += "d";  
        System.out.println( s1 + " "+ s2+" "+(s1==s2));

        StringBuilder sb1 = new StringBuilder("abc");
        StringBuilder sb2 = sb1;
        sb1.append("d");
        System.out.println( sb1 + " "+ sb2+" "+(sb1==sb2));
        StringTest5 m = new StringTest5();
        m.doIt();
    }
    
}
