package s0904;

import java.util.Scanner;

public class RobotRace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("로봇선택:");
		Scanner s = new Scanner(System.in);
		String myRobot = s.next();
		
		Race a=new Race("A");
		Race b=new Race("B");
		Race c=new Race("C");
		
		a.start();
		b.start();
		c.start();
		
		
	}

}

class Race extends Thread{
	static int score=0;
	String name;
	Race(String name){
		this.name=name;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<10;i++) {
			if(name.equals("A")) {
				System.out.println("A");
			}else if(name.equals("B")) {
				System.out.println("\tB");
			}else if(name.equals("C")) {
				System.out.println("\t\tC");
			}
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		score++;
		System.out.println(name+":결승선 도착");
		System.out.println(name+":"+score);
	}
}