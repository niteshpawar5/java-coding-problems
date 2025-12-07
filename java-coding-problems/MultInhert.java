class A{
	void set(){
		System.out.println("Hello");
	}
}
class B{
	void get(){
		System.out.println("Hi");
	}
}
class C extends A,B{
	void display(){
		System.out.println("Welcome");
	}
}
public class MultInhert{
	public static void main(String[] args) {
		C c1=new C();
		c1.set();
		c1.get();
		c1.display();
	}
}