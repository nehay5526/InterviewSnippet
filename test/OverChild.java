class Parent {
	public Object getMyNotes(Object notes) {
		System.out.println("Parent class");
		return notes;
	}
}
class OverChild extends Parent {
	public String getMyNotes(String notes) {
		System.out.println("Child class");
		return notes;
	}
	public static void main(String[] args) throws Exception {
		Parent p = new OverChild();
		p.getMyNotes("here is my notes");
	}
}
