package s0904;

public class SingleThreasd {

	public static void main(String[] args) {
		for(int i=0;i<10;i++) {
			System.out.println("* ");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		for(int i=0;i<10;i++) {
			System.out.println(". ");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
