package s0904;

public class MultiTherad_1 {

	public static void main(String[] args) {

		MyTherad my = new MyTherad();
		my.start();
		MyTherad_1 my1 = new MyTherad_1();
		my1.start();
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++) {
			System.out.print("* ");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}

class MyTherad extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.print(". ");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}

class MyTherad_1 extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.print("@ ");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}