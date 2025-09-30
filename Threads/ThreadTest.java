class Test extends Thread{

	public void run(){
	 	System.out.println("Thread is Running ");
	}
}


class ThreadTest{

	public static void main(String[] yash){

		Test t1 = new Test();
		t1.start();
	}
}