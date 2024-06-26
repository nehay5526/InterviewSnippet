	class Derived {
		public final void getDetails() {
			System.out.println("derived class");
		}
	}
	public class Main1 extends Derived {
		public final void getDetails() {
			System.out.println("test class");
		}	
		public static void main(String[] args) throws Exception {
			Derived obj = new Derived();
			obj.getDetails();
		}
	}