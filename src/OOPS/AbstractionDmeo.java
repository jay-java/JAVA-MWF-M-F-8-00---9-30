package OOPS;
abstract class RBI{
	public abstract void interest();
	public abstract void homeloan();
	public void RepoRate() {
		System.out.println("Repo rate : 4%");
	}
}
class SBI extends RBI{
	public void interest() {
		System.out.println("sbi interest  : 6%");
	}
	public void homeloan() {
		System.out.println("sbi hoemloan : 10%");
	}
}
class BOB extends RBI{
	public void interest() {
	System.out.println("bob interest : 7%");
	}
	public void homeloan() {
		System.out.println("bob homeloan : 10.5%");
	}
	
}
class JAVA1 extends RBI{
	public void interest() {
		System.out.println("java interest : 8%");
	}
	public void homeloan() {
		System.out.println("java homeloan : 9%");
	}
}
public class AbstractionDmeo {
	public static void main(String[] args) {
		SBI s = new SBI();
		s.interest();
		s.homeloan();
		s.RepoRate();
		SBI s1 = new SBI();
		s1.interest();
		s1.homeloan();
		BOB b = new BOB();
		b.interest();
		b.homeloan();
		JAVA1 j = new JAVA1();
		j.interest();
		j.homeloan();
	}
}
