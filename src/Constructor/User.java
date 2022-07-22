package Constructor;
// constructor is special member function of class which has same name as class name
// " called when object is created
// " have no return type
class User1{
	int l,b;
	//1.default cons
	User1(){
		System.out.println("default constructor");
	}
	//2.parameterized cons
	User1(int l,int b){
		this.l = l;
		this.b = b;
		System.out.println("l = "+l+" b = "+b);
		System.out.println("Area of rectangle : "+(l*b));
	}
	//3.copy cons
	User1(User1 u){
		int a,b;
		a = u.l;
		b = u.b;
		System.out.println("a = "+a+" b = "+b);
	}
	public void show() {
		System.out.println("l = "+l+" b= "+b);
	}
}
public class User {
	public static void main(String[] args) {
		Student s = new Student();
		s.showData();
		User1 u = new User1(10,2);
		u.show();
		User1 u1 = new User1(u);
	}
}
