package Test_Thread;

public class ThreadTest extends Thread {

	private int threadNo;
	private String lock;

	public ThreadTest(int threadNo) {
		this.threadNo = threadNo;
	}

	@Override
	public void run() {
		abc(threadNo);
	}
	
	public static synchronized void abc(int threadNo){
		for(int i=1;i<100;i++){
			System.out.println("No. " + threadNo + i);
		}
	}

	public static void main(String[] args) throws Exception {
		for (int i = 1; i < 4; i++) {
			new ThreadTest(i).start();
			Thread.sleep(1);
		}
	}

}
