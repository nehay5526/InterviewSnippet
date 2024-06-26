	class Parent {

	void show(){
	System.out.println("Show parent");
	}

	}

	interface M1 {

		void show();

	}

	interface M2 {

	 void show();

	}
	public class Child extends Parent implements M1,M2{
    void show(){
	System.out.println("Show Child");
	}

	public static void main(String... args)
	{

	Child child = new Child();
	child.show();

	Parent p = new Child();
	p.show();

	M1 m1 = new Child();

	m1.show();

	M2 m2 = new Child();

	m2.show();

	}



}

/**

static void show(){
	System.out.println("Show M1");

	}

static void show()
	{
	System.out.println(" static show parent");

	}
**/