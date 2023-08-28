package s0828;

public class Lotto {

	public static void main(String[] args) {
		System.out.println("ArrayList로 로또만둘기");
		
		LottoArrayList Lotto1= new LottoArrayList();
		Lotto1.RandomBalls();
		
	
		
		
		System.out.println("HashSet로 로또만들기");
		LottoHashSet Lotto2= new LottoHashSet();
		Lotto2.RandomBalls();
		

	}

}
