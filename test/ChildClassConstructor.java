class ParentClassConstructor {
	private String parentName;private String parentType;
	ParentClassConstructor() {
		System.out.println("Parent constructor called");}
	ParentClassConstructor(String parentType, String parentName) {
		this.parentType = parentType;
		this.parentName = parentName;
		System.out.println(String.format("Parent Parameterized Constructor called : %s - %s", parentName, parentType));}}
class ChildClassConstructor extends ParentClassConstructor {
	private String childName;private String childType;
	ChildClassConstructor(String childType, String childName) {
		this();
		this.childType = childType;
		this.childName = childName;
		System.out.println(String.format("Child Parameterized Constructor called : %s - %s",
				childName, childType));}
	ChildClassConstructor() {
		this("Madan", "developer");
		System.out.println("Child Default Constructor called");}
	public static void main(String[] args) {
		ChildClassConstructor child = new ChildClassConstructor("Madan", "developer");
	}
}
