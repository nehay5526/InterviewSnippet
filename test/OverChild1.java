class Parent {
	public  String getMyNotes(String notes) throws RuntimeException{
		System.out.println("Parent class");
		return notes;
	}
}
class OverChild1 extends Parent {
	public  String getMyNotes(String notes) throws Exception {
		System.out.println("Child class");
		return notes;
	}
	public static void main(String[] args)  throws Exception{
		Parent p = new OverChild1();
		p.getMyNotes("here is my notes");
	}
}















//Wider scope of exception


// class Parent {
// 	public String getMyNotes(String notes) throws Exception{
// 		System.out.println("Parent class");
// 		return notes;
// 	}
// }
// class OverChild1 extends Parent {
// 	public Object getMyNotes(Object notes) throws RuntimeException{
// 		System.out.println("Child class");
// 		return notes;
// 	}
// 	public static void main(String[] args)  {
// 		Parent p = new OverChild1();
// 		p.getMyNotes("here is my notes");
// 	}
// }
