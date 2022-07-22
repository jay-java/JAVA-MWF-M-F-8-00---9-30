package Threading;
//two ways to achieve thread  
//1.THread class
//2.Runnable interface
//Priority ->1.MIN ->1 2.NORM ->5 3.MAX->10
class First extends Thread{
	public void run(){
		System.out.println("thread is running");
	}
}
class Second implements Runnable{
	public void run() {
		System.out.println("runnable interface thread");
	}
}
public class TreadDemo {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread());
		Thread t1 = new Thread();
		System.out.println(t1);
		t1.setName("New Thread");
		System.out.println(t1);
		t1.setPriority(10);
		System.out.println(t1);
		try {
			for(int i =1;i<=5;i++) {
				System.out.println(t1+" : "+i);
				t1.sleep(5000);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		
//		First f = new First();
//		f.start();
//		Second s = new Second();
//		Thread t = new Thread(s);
//		t.start();
		
	}
}
